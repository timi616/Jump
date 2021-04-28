package com.blendstudy.jump.mapper;

import com.blendstudy.jump.entity.IndexEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IndexMapper {

//    作用：
//        用注解来简化xml配置的时候（比如Mybatis的Mapper.xml中的sql参数引入），
//        @Param注解的作用是给参数命名,参数命名后就能根据名字得到参数值,正确的将参数传入sql语句中
//        （一般通过#{}的方式，${}会有sql注入的问题）。


//    public List<IndexEntity> getCsutomerList(String custno);

    public List<IndexEntity> getCsutomerList(@Param("custno") String custno);

    public IndexEntity getCsutomerList2(@Param("custno") String custno);
}
