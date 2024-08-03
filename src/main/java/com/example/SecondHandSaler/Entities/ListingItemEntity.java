package com.example.SecondHandSaler.Entities;

import com.example.SecondHandSaler.Entities.Enums.CurrencyEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListingItemEntity {
    @Id
    @GeneratedValue
    Long id;
    @Column
    String title;
    @Column
    String description;
    @Column
    String imageUrl;
    @Column
    Double price;
    @Column
    @Enumerated(EnumType.STRING)
    CurrencyEnum currency;
    @ManyToOne()
    UserEntity seller;
}
