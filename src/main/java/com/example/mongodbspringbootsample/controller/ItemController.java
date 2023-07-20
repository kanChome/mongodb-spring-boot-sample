package com.example.mongodbspringbootsample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodbspringbootsample.model.GroceryItem;
import com.example.mongodbspringbootsample.service.ItemService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/items")
@RequiredArgsConstructor
public class ItemController {

  private final ItemService itemService;

  @GetMapping
  public List<GroceryItem> findAll() {
    return itemService.findAll();
  }

  @PostMapping
  public void insertItem(@RequestBody GroceryItem item) {
    itemService.insert(item);
  }
}
