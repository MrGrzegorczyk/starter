package com.example.starter.controllers;

import com.example.starter.entities.Item;
import com.example.starter.entities.User;
import com.example.starter.repositories.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ItemController {

  private ItemRepository itemRepository;

  private User user;

  @PostMapping(value = "/items")
  public String createItem(@RequestBody Item item){
    itemRepository.save(item);
    return "Item created successfull";
  }

  @GetMapping(value = "/items")
  public List<Item> getUserItems(){
    return user.getItemsList();
  }
}
