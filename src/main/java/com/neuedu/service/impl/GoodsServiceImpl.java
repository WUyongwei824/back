package com.neuedu.service.impl;

import com.neuedu.dao.GoodsMapper;
import com.neuedu.pojo.Goods;
import com.neuedu.pojo.GoodsExample;
import com.neuedu.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/4/3.
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    GoodsMapper goodsMapper;
    @Override
    public List<Goods> list() {
        return goodsMapper.selectByExample(new GoodsExample());
    }
}
