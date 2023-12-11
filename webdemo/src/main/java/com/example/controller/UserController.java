package com.example.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.QueryPageParam;
import com.example.common.Result;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cui
 * @since 2023-11-26
 */
@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public List<User>list(){
        return userService.list();
    }

    //新增
    @PostMapping("/save")
    public boolean save(@RequestBody User user){
        return userService.save(user);
    }
    //修改
    @PostMapping("mod")
    public boolean mod(@RequestBody User user){
        return  userService.updateById(user);
    }
    //新增或修改
    @PostMapping("saveorMod")
    public boolean saveorMod(@RequestBody User user){
        return  userService.saveOrUpdate(user);
    }
    //删除
    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userService.removeById(id);
    }
    //查询
    @PostMapping("/listP")
    public List<User>listP(@RequestBody User user){
        LambdaQueryWrapper<User>lambdaQueryWrapper=new LambdaQueryWrapper();
        lambdaQueryWrapper.like(User::getName,user.getName());
        return userService.list(lambdaQueryWrapper);
    }
   // @PostMapping("/listpage")
////    public List<User>listpage(@RequestBody HashMap map){
//    public List<User>listpage(@RequestBody QueryPageParam query){
//        HashMap param=query.getParam();
//        String name=(String)param.get("name");
////        System.out.println(query);
//       /* LambdaQueryWrapper<User>lambdaQueryWrapper=new LambdaQueryWrapper();
//        lambdaQueryWrapper.like(User::getName,user.getName());
//        return userService.list(lambdaQueryWrapper);*/
//        Page<User> page=new Page();
//        page.setCurrent(query.getPageNum());
//        page.setSize(query.getPageSize());
//        LambdaQueryWrapper<User>lambdaQueryWrapper=new LambdaQueryWrapper();
//        lambdaQueryWrapper.like(User::getName,name);
//        IPage result=userService.page(page,lambdaQueryWrapper);
//        System.out.println("total=="+result.getTotal());
//        return Result.suc(result.getRecords(),result.getTotal());
//    }
   @PostMapping("/login")
   public Result login(@RequestBody User user){
        List<User> list= userService.lambdaQuery().
                eq(User::getNo,user.getNo()).
                eq(User::getPassword,user.getPassword()).list();
        if(list.size()<=0){
            return Result.fail();
        }else {
            return Result.suc();
        }
   }
    @PostMapping("/listPageC")
    public Result listPageC(@RequestBody QueryPageParam query){
            HashMap param=query.getParam();
            if (param == null) {
                return Result.fail();
            }
            System.out.println(param);
            String name=(String)param.get("name");
            String no=(String)param.get("no");
            Page<User> page=new Page();
            page.setCurrent(query.getPageNum());
            page.setSize(query.getPageSize());
            LambdaQueryWrapper<User>lambdaQueryWrapper=new LambdaQueryWrapper();
            lambdaQueryWrapper.eq(User::getNo,no);
            IPage result=userService.page(page,lambdaQueryWrapper);
            System.out.println("total=="+result.getTotal());
            return Result.suc(result.getRecords(),result.getTotal());
        }

}
