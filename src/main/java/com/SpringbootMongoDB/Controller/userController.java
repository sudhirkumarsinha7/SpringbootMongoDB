package com.SpringbootMongoDB.Controller;

import com.SpringbootMongoDB.model.User;
import com.SpringbootMongoDB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/")

public class userController {
    @Autowired
    private UserService userService;
    @RequestMapping(value ="/adUser",method = RequestMethod.POST)
    public String addUser(@RequestBody User user) {
        User p = userService.create(user);
        return p.toString();
    }

    @RequestMapping(value="/getUser",method = RequestMethod.POST)
    public User getUser(@RequestParam String email) {
        return userService.getByEmail(email);
    }
    @RequestMapping(value="/getAllUser",method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }
    /*@RequestMapping("/update")
    public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
        User p = userService.update(firstName, lastName, age);
        return p.toString();
    }*/
    @RequestMapping(value="/deleteUser",method = RequestMethod.DELETE)

    public String delete(@RequestParam String name) {
        userService.delete(name);
        return "Deleted "+name;
    }
    @RequestMapping(value="/deleteAllUser",method = RequestMethod.DELETE)
    public String deleteAll() {
        userService.deleteAll();
        return "Deleted all records";
    }


}

