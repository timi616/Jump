package com.blendstudy.jump.service;

import com.blendstudy.jump.entity.IndexEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IndexService {

    public List<IndexEntity> getCsutomerList(@Param("custno") String custno);

    public IndexEntity getCsutomerList2(@Param("custno") String custno);
}
