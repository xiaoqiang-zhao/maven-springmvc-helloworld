package com.mavenSpringmvcHelloworld.controller;

import com.google.gson.Gson;
import com.mavenSpringmvcHelloworld.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    public UserController() {
    }

    @RequestMapping(value="{name}", method = RequestMethod.GET)

    public @ResponseBody
    String getUser(@PathVariable String name) {

        User user = new User();

        user.setName(name);
        user.setId(1);

        Gson gson = new Gson();
        String jsonObject = gson.toJson(user);
        return jsonObject;
    }
}
