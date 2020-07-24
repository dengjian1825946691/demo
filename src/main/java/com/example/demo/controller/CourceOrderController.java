package com.example.demo.controller;
import com.example.demo.pojo.PageResult;
import com.example.demo.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/courceorder")
public class CourceOrderController {

    @RequestMapping("/list")
    public String list(){
        return "courceorder/list";
    }

    @ResponseBody
    @RequestMapping("/orderlist")
    public PageResult getProductList(){
        PageResult<Product> result = new PageResult<Product>();
        result.setCode(0);
        result.setCount(200);
        result.setMsg("消息通知");
        Product product = new Product();
        List<Product> products = Arrays.asList(new Product(1, "产品1", "深圳", "型号2", "美元", Double.valueOf(23), 50, "被指", 3),
                new Product(2, "产品2", "深圳", "型号2", "美元", Double.valueOf(23), 50, "被指", 3),
                new Product(3, "产品3", "深圳", "型号2", "美元", Double.valueOf(23), 50, "被指", 3),
                new Product(4, "产品4", "深圳", "型号2", "美元", Double.valueOf(23), 50, "被指", 3));
        result.setData(products);
        return result;
    }
}
