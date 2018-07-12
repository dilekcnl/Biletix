
var myApp = angular.module('biletix',[])
    .controller('KategoriController',function ($scope, $http) {

        $scope.kategori={};//angularjs model
        $scope.kategoriList=[];

    $scope.pageOpen=function () {
        $scope.kategoriGetir();
        $scope.sehirGetir();
        $scope.mekanGetir();
        $scope.etkinlikGetir();

    }
        $scope.kategoriGetir=function () {
            var res=$http.get('api/kategori/kategoriGetir');
            res.then(function (response) {
                $scope.kategoriList=response.data;

            });

        }

        $scope.sehirGetir=function () {
            var res=$http.get('api/sehir/sehirGetir');
            res.then(function (response) {
                $scope.sehirList=response.data;

            });

        }
        $scope.mekanGetir=function () {
            var res=$http.get('api/mekan/mekanGetir');
            res.then(function (response) {
                $scope.mekanList=response.data;

            });

        }

        $scope.etkinlikGetir=function () {
            var res=$http.get('api/etkinlik/etkinlikGetir');
            res.then(function (response) {
                $scope.etkinlikList=response.data;

            });

        }
});



