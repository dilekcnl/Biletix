package com.example.biletix.Repository;

import com.example.biletix.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    User findByName(String name);
}
