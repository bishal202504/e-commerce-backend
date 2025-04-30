package org.ecom.repo;

import org.ecom.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends JpaRepository<User, Integer> {

    User findByEmailId(String email);

    User findByEmailIdAndPassword(String email, String password);

}