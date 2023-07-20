package com.example.mongodbspringbootsample.service;

import java.util.List;

import com.example.mongodbspringbootsample.model.GroceryItem;

public interface ItemService {

  public void insert(GroceryItem item);

  public List<GroceryItem> findAll();

  public int numberOfItems();

  public GroceryItem findItemByName(String name);
}
