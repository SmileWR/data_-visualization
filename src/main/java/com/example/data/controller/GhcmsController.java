package com.example.data.controller;


import com.example.data.entity.Goods;
import com.example.data.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GhcmsController {
    @Autowired
    private GoodsService goodsService;

@RequestMapping("/test")
    public String test(Model model){
    Goods gd = goodsService.testMybatis();
    model.addAttribute("goods",gd);
    return "/test";
}

}
