package com.sk.mall.service.impl;

import com.sk.mall.dao.CategoryMapper;
import com.sk.mall.entity.Category;
import com.sk.mall.service.CateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cateService")
public class CateServiceImpl implements CateService {

    @Autowired(required = false)
    CategoryMapper categoryMapper;

    @Override
    public List<Category> getAllCate() {
        return categoryMapper.getAllCate();
    }

    @Override
    public void insertSelective(Category category) {
        categoryMapper.insertSelective(category);
    }

    @Override
    public Category selectById(Integer category) {
        return categoryMapper.selectByPrimaryKey(category);
    }

    @Override
    public void updateByPrimaryKeySelective(Category category) {
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public void deleteById(Integer id) {
        categoryMapper.deleteById(id);
    }
}
