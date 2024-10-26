package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "User Management", description = "Operations related to users")
public class UserController {

    private List<String> users = new ArrayList<>();

    @GetMapping("/get-list")
    @Operation(summary = "Get user list", description = "Retrieve a list of all users")
    public List<String> getUsers() {
        return users;
    }

    @PostMapping("/add")
    @Operation(summary = "Add a user", description = "Add a new user by providing a username")
    public String addUser(@RequestBody String userName) {
        users.add(userName);
        return "User " + userName + " added!";
    }

    @GetMapping("/get/{username}")
    @Operation(summary = "Get a specific user", description = "Retrieve details of a specific user by username")
    public String getUser(@PathVariable String username) {
        if (users.contains(username)) {
            return "User found: " + username;
        } else {
            return "User not found: " + username;
        }
    }

    @DeleteMapping("/delete/{username}")
    @Operation(summary = "Delete a user", description = "Delete a user by providing a username")
    public String deleteUser(@PathVariable String username) {
        if (users.remove(username)) {
            return "User " + username + " deleted!";
        } else {
            return "User not found: " + username;
        }
    }
}
