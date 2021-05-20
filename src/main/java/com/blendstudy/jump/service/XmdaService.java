package com.blendstudy.jump.service;

import com.blendstudy.jump.entity.Xmda;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XmdaService {
    public List<Xmda> getOrderList(@Param("xmda004") String xmda004);
}
