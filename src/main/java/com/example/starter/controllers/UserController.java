package com.example.starter.controllers;

import com.example.starter.config.LoginForm;
import com.example.starter.entities.User;
import com.example.starter.repositories.ItemRepository;
import com.example.starter.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

  private final UserRepository userRepository;
  private final ItemRepository itemRepository;
  public UserController(UserRepository userRepository, ItemRepository itemRepository) {
    this.userRepository = userRepository;
    this.itemRepository = itemRepository;
  }

    private String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiSm9obiBEb2UiLCJyb2xlIjoiU3R1ZGVudCJ9.IxBkuQHrrwJrc8_IA5DPdGhBKx43iYsricXKXUQt_8o";

  @PostMapping(value = "/login")
    @ResponseBody
    public String getLoginPage(){
      return token;
    }

    @PostMapping(value = "/register")
    public String register(@RequestBody User user) {
      userRepository.save(user);
      return "redirect:/register";
  }


}
