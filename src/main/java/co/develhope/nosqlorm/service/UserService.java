package co.develhope.nosqlorm.service;

import co.develhope.nosqlorm.entities.User;
import co.develhope.nosqlorm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
}