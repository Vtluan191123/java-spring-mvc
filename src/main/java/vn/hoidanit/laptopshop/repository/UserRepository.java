package vn.hoidanit.laptopshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User newUser);
}