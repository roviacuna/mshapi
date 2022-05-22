package com.msh.mshapi.controller;

import com.msh.mshapi.entity.User;
import com.msh.mshapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allusers")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.allUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getEmployeeById(@PathVariable(value = "id") String id) {
        User user = userService.getUser(id);
        return ResponseEntity.ok().body(user);
    }


}
