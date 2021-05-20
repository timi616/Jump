package com.blendstudy.jump.mapper;

import com.blendstudy.jump.entity.Xmda;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface XmdaMapper {
    public List<Xmda> getOrderList(@Param("xmda004") String xmda004);
}
