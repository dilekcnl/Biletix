var myApp = angular.module('biletix',[]).controller('KategoriController',function ($scope, $http) {

        $scope.kategori = {}//angularjs model
        $scope.kategoriList = [];
        $scope.pageOpen=function () {
            $scope.kategoriGetir();

        }
        $scope.kategoriGetir=function () {
            var res=$http.get('api/kategori/kategoriGetir');
            res.then(function (response) {
                $scope.kategoriList=response.data;

            });

        }
        $scope.save = function ()
        {
            var myApp = $http.post("/api/kategori/saveKategori", $scope.kategori)
            myApp.then(function (response)
            {
                alert(response.data);
                $scope.kategoriGetir();
            });
        }
        $scope.selectKategori = function (kategori)
        {
            $scope.kategori = kategori;

        }

    $scope.deleteKategori=function (kat) {
        $scope.kategori=kat;
        var x=$http.post('/api/kategori/kategoriSil', $scope.kategori);
        x.then(function (response) {
            $scope.kategori={};
            $scope.kategoriGetir();
        });
    }

    });


