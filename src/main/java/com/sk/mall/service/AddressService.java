package com.sk.mall.service;

import com.sk.mall.entity.Address;
//import com.sk.mall.entity.AddressExample;

import java.util.List;

/**
 * @author qiaochx
 */
public interface AddressService {
     /**
      *  根据用户id 查询所有地址
      *
      * @param userId 用户id
      * @return List<Address>
      */
     List<Address> getAllAddressByUserId(Integer userId);

     void updateByPrimaryKeySelective(Address address);

     void deleteByPrimaryKey(Integer addressid);

     void insert(Address address);

     void insertSelective(Address address);

     Address selectByPrimaryKey(Integer addressid);
}
