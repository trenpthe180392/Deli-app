package edu.mo.coffee.fooddelivery.repository;

import edu.mo.coffee.fooddelivery.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByFullName(String fullName);
}
