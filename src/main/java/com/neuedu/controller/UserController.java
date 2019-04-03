package com.neuedu.controller;

import com.neuedu.pojo.Goods;
import com.neuedu.pojo.Student;
import com.neuedu.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/4/3.
 */
@RestController
public class UserController {
    @Resource
    GoodsService goodsService;
    @GetMapping("/index")
    public List<Goods> index(){
        return goodsService.list();
    }
}
