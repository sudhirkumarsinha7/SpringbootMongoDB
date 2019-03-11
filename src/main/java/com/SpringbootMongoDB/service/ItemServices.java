package com.SpringbootMongoDB.service;

import com.SpringbootMongoDB.model.Items;
import com.SpringbootMongoDB.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ItemServices {
    @Autowired
    private ItemRepository itemRepository;
    //Add Items
    public Items addItem(@RequestBody Items items) {
        return itemRepository.save(items);
    }
    //Retrive Items
    public List<Items> retriveItems(){
        return itemRepository.findAll();
    }

    public void getItem(@RequestBody Items items) {
        itemRepository.findByItemName(items.getItemName());
    }
    //Delete operation
    public void deleteAllItems() {
        itemRepository.deleteAll();
    }
    //delete one item
    public void delete(String items) {
        Items p = itemRepository.findByItemName(items);
        itemRepository.delete(p);
    }

}
