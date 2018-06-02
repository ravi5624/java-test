package com.test.controller;

import com.test.dto.UserDto;
import com.test.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    public UserDto getUsers(){
        UserDto userDto = new UserDto();
        User user = new User();
        userDto.setAddress(user.getAddress());
        userDto.setAge(user.getAge());
        userDto.setEmail(user.getEmail());
        userDto.setId(user.getId());
        return userDto;
    }
}
