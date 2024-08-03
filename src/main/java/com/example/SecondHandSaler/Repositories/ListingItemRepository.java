package com.example.SecondHandSaler.Repositories;

import com.example.SecondHandSaler.Entities.ListingItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingItemRepository extends JpaRepository<ListingItemEntity, Long>  {
}
