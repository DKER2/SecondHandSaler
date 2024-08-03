package com.example.SecondHandSaler.Controllers;

import com.example.SecondHandSaler.Entities.ListingItemEntity;
import com.example.SecondHandSaler.Services.ListingItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/listingItem")
public class ListingItemController {
    private final ListingItemService listingItemService;

    @PutMapping("/createListingItem")
    public void createListingItem(@RequestBody ListingItemEntity listingItemEntity) {
        listingItemService.createListingItem(listingItemEntity);
    }
}
