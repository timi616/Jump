package com.blendstudy.jump.service.impl;

import com.blendstudy.jump.entity.Xmda;
import com.blendstudy.jump.mapper.XmdaMapper;
import com.blendstudy.jump.service.XmdaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XmdaServiceImpl implements XmdaService {

    @Autowired
    XmdaMapper xmdaMapper;

    @Override
    public List<Xmda> getOrderList(String xmda004) {
        List<Xmda> orderList = xmdaMapper.getOrderList(xmda004);
        return orderList;
    }
}
