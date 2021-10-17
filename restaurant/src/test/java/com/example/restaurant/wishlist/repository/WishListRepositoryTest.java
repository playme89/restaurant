package com.example.restaurant.wishlist.repository;

import com.example.restaurant.wishlist.entity.WishListEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListRepositoryTest {

    private WishListRepository wishListRepository;

    @Autowired
    private WishListEntity create(){
        var wishList = new WishListEntity();
        wishList.set
    }


    @Test
    public void saveTest() {
    }

    @Test
    public void findByIdTest(){

    }

    @Test
    public void deleteTest(){

    }
}
