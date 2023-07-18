package com.example.mongodbspringbootsample.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodbspringbootsample.model.GroceryItem;
import com.example.mongodbspringbootsample.repository.ItemRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/items")
@RequiredArgsConstructor
public class ItemController {

  private final ItemRepository itemRepository;

  @GetMapping
  public List<GroceryItem> findAll() {
    return itemRepository.findAll();
  }
}
