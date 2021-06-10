package com.wizzybc.gittest.web;

import com.wizzybc.gittest.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/testgit")
    public @ResponseBody String testgit(){
        User user = new User();
        user.setId(1001);
        user.setName("wizzy");
        return "User Detail: "+user;
    }
}
