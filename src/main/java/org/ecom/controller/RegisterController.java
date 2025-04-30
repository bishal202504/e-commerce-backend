package org.ecom.controller;

import org.ecom.model.User;
import org.ecom.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping(path = "/register")
    public User registerUser(@RequestBody User user) throws Exception {

        String tempEmailId=user.getEmailId();
        if(tempEmailId != null && "".equals(tempEmailId)) {
            User userobj=	registerService.fetchByEmailId(tempEmailId);

            if(userobj!=null) {
                throw new Exception("user with"+tempEmailId+ "is already esxists");
            }
        }

        User userObj=null;
        userObj=registerService.saveUser(user);
        return userObj;

    }
    @PostMapping(path = "/login")
    public User loginUser(@RequestBody User user) throws Exception {
        String tempEmailId=user.getEmailId();
        String tempPass =user.getPassword();

        User userObj=null;

        if(tempEmailId!= null && tempPass!=null) {
            userObj  =	registerService.fetchByEmailIdAndPassword(tempEmailId, tempPass);
        }
        if(userObj==null) {
            throw new Exception("Bad Credentials");

        }


        return userObj;
    }

}
