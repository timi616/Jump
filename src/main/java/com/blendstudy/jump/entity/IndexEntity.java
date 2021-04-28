package com.blendstudy.jump.entity;

import lombok.Data;

//@Data : 注解在类上, 为类提供读写属性，从而不用写get、set方法。 此外还提供了 equals()、hashCode()、toString() 方法
//@Getter/@Setter : 注解在类上, 为类提供读写属性
//@ToString : 注解在类上, 为类提供 toString() 方法
//@Slf4j : 注解在类上, 为类提供一个属性名为 log 的 log4j 的日志对象
//@Log4j : 注解在类上, 为类提供一个属性名为 log 的 log4j 的日志对象
@Data
public class IndexEntity {

    private String custno;
    private String type;
}
