package com.example.demo;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.pojo.Product;
import com.example.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private User user;
    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
