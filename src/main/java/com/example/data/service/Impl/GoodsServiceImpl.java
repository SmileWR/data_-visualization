package com.example.data.service.Impl;


import com.example.data.dao.GoodsDao;
import com.example.data.entity.Goods;
import com.example.data.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods testMybatis(){
        return goodsDao.selectByPrimaryKey(7);
    }
}

