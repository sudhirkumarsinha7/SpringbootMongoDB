package com.SpringbootMongoDB.Controller;

import com.SpringbootMongoDB.model.Items;
import com.SpringbootMongoDB.model.User;
import com.SpringbootMongoDB.service.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/")
public class ItemController {
    @Autowired
    private ItemServices itemService;
    @RequestMapping(value ="/addItem",method = RequestMethod.POST)
    public String addItem(@RequestBody Items item) {
        Items p = itemService.addItem(item);
        return p.toString();
    }
    @RequestMapping(value="/getItems",method = RequestMethod.GET)
    public List<Items> retriveItems(){
        return itemService.retriveItems();
    }
//    @RequestMapping(value="/getItem",method = RequestMethod.POST)
//    public User getItems(@RequestParam String email)
//    {
//        return itemService.getByEmail(email);
//    }
}
