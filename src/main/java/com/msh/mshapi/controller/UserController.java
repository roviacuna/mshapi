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
    public ResponseEntity<User> getEmployeeById(@PathVariable(value = "id") int id) {
        User user = userService.getUser(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok().body(user);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") int id, @RequestBody User user) {
        userService.updateUser(user);
        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(User user, @PathVariable(value = "id") int id) {
        userService.deleteUser(user, id);
       return "User " + user.getName() + " has been deleted.";

    }


}
