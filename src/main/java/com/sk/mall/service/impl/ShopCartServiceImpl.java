package com.sk.mall.service.impl;


import com.sk.mall.dao.ShopCartMapper;
import com.sk.mall.entity.ShopCart;
import com.sk.mall.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addShopCart")
public class ShopCartServiceImpl implements ShopCartService {

    @Autowired(required = false)
    ShopCartMapper shopCartMapper;

    @Override
    public void addShopCart(ShopCart shopCart) {
        shopCartMapper.insertSelective(shopCart);
    }

    @Override
    public List<ShopCart> selectByExample(String userId) {
        return shopCartMapper.getShopCartsByUserId(userId);
    }

    @Override
    public void deleteByKey(ShopCart shopCartKey) {
        shopCartMapper.deleteByPrimaryKey(shopCartKey);
    }

    @Override
    public void updateCartByKey(ShopCart shopCart) {
        shopCartMapper.updateByPrimaryKeySelective(shopCart);
    }

    @Override
    public ShopCart selectCartByKey(ShopCart shopCartKey) {
        return shopCartMapper.selectByPrimaryKey(shopCartKey);
    }

}