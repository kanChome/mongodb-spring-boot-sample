package com.example.mongodbspringbootsample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mongodbspringbootsample.model.GroceryItem;
import com.example.mongodbspringbootsample.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

  private final ItemRepository itemRepository;

  public ItemServiceImpl(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  @Override
  public void insert(GroceryItem item) {
    itemRepository.save(item);
  }

  @Override
  public List<GroceryItem> findAll() {
    // TODO:
    return null;
  }

  @Override
  public int numberOfItems() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'numberOfItems'");
  }

  @Override
  public GroceryItem findItemByName(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findItemByName'");
  }

}
