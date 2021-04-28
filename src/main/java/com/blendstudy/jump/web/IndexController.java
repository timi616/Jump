package com.blendstudy.jump.web;

import com.blendstudy.jump.entity.IndexEntity;
import com.blendstudy.jump.entity.User;
import com.blendstudy.jump.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController 是Spring4之后新加入的注解，原来返回json需要@ResponseBody和@Controller配合。
//即@RestController是@ResponseBody和@Controller的组合注解。
//@CrossOrigin 跨域

@CrossOrigin
@RestController
@RequestMapping("/index")
public class IndexController {

//    @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
//    @PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。

    @GetMapping("/getIndexInfo")
    public String getIndexInfo(){
        //直接返回数据
        return "before jump study one";
    }

    @GetMapping("/getListInfo")
    public List getListInfo(){
        //1.集合
        List list = new ArrayList();
        list.add("name");
        list.add("age");
        list.add("sex");
        return list;
    }
    @GetMapping("/getArrInfo1")
    public int[] getArrInfo1(){
        //2.数组
        int [] arr = new int[3]; /*开辟了一个长度为3的数组*/
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        return arr;
    }
    @GetMapping("/getArrInfo2")
    public int[][] getArrInfo2(){
        //2.数组
        int [][] arr = new int[][]{{1231,1232,1233},{1111,2222,3333}};
        return arr;
    }
    @GetMapping("/getList1")
    public User getList1(){
        //1.将数组的值放到对象里
        String arr[] = {"23","456","6567","3456","234"};
        User user = new User();

        user.id = arr[0];
        user.name = arr[1];
        user.password = arr[2];
        user.sex = arr[3];
        user.tel = arr[4];
        return user;
    }

    @Autowired
    IndexService indexService;

    @GetMapping("/getCustomerInfo")
    public List<IndexEntity> getCustomerInfo(String custno){
        //3.List 对象
        List<IndexEntity> cus = indexService.getCsutomerList(custno);
        return cus;
    }

    @GetMapping("/getCustomerInfo2")
    public IndexEntity getCustomerInfo2(String custno){
        //3.对象
        IndexEntity cus = indexService.getCsutomerList2(custno);
        return cus;
    }

}
