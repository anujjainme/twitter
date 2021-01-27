package com.mishipay.twitter;

import com.mishipay.twitter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    @ResponseBody
    public List<String> getAllUsers() {
        return userService.list().stream().map(u->u.getName()).collect(Collectors.toList());
    }

    @GetMapping("/users/following")
    @ResponseBody
    public List<String> getAllFollowers(@RequestParam long id) {
        return userService.followers(id);
    }
}
