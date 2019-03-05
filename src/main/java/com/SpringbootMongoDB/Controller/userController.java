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
    @RequestMapping(value ="/create",method = RequestMethod.POST)
    public String create(@RequestBody User user) {
        User p = userService.create(user);
        return p.toString();
    }

    @RequestMapping(value="/get",method = RequestMethod.GET)
    public User getUser(@RequestParam String firstName) {
        return userService.getByFirstName(firstName);
    }
    @RequestMapping(value="/getAll",method = RequestMethod.GET)
    public List<User> getAll(){
        return userService.getAll();
    }
    /*@RequestMapping("/update")
    public String update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
        User p = userService.update(firstName, lastName, age);
        return p.toString();
    }*/
    @RequestMapping(value="/delete",method = RequestMethod.DELETE)

    public String delete(@RequestParam String firstName) {
        userService.delete(firstName);
        return "Deleted "+firstName;
    }
    @RequestMapping(value="/deleteAll",method = RequestMethod.DELETE)
    public String deleteAll() {
        userService.deleteAll();
        return "Deleted all records";
    }


}

