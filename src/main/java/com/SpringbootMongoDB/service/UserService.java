package com.SpringbootMongoDB.service;


import com.SpringbootMongoDB.model.User;
import com.SpringbootMongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Create operation
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }
    //Retrieve operation
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public User getByFirstName(String firstName) {
        return userRepository.findByName(firstName);
    }
    //Update operation
//    public User update(String firstName, String lastName, int age) {
//        User p = userRepository.findByName(firstName);
//        /*p.setLastName(lastName);
//        p.setAge(age);*/
//        return userRepository.save(p);
//    }
    //Delete operation
    public void deleteAll() {
        userRepository.deleteAll();
    }
    public void delete(String firstName) {
        User p = userRepository.findByName(firstName);
        userRepository.delete(p);
    }
}
