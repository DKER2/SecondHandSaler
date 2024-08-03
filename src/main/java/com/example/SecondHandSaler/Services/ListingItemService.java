package com.example.SecondHandSaler.Services;

import com.example.SecondHandSaler.Entities.ListingItemEntity;
import com.example.SecondHandSaler.Repositories.ListingItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ListingItemService {
    private final ListingItemRepository listingItemRepository;

    public void createListingItem(ListingItemEntity listingItemEntity) {
        listingItemRepository.save(listingItemEntity);
    }
}
