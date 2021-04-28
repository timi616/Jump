package com.blendstudy.jump.service.impl;

import com.blendstudy.jump.entity.IndexEntity;
import com.blendstudy.jump.mapper.IndexMapper;
import com.blendstudy.jump.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;

    @Override
    public List<IndexEntity> getCsutomerList(String custno) {
        List<IndexEntity> cus = indexMapper.getCsutomerList(custno);
        return cus;
    }

    @Override
    public IndexEntity getCsutomerList2(String custno) {
        IndexEntity cus = indexMapper.getCsutomerList2(custno);
        return cus;
    }
}
