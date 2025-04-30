package org.ecom.service;

import org.ecom.model.User;
import org.ecom.repo.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    public User saveUser(User user) {

        return registerRepo.save(user);

    }

    public User fetchByEmailId(String email) {

        return registerRepo.findByEmailId(email);

    }

    public User fetchByEmailIdAndPassword(String email, String password) {

        return registerRepo.findByEmailIdAndPassword(email, password);

    }
}
