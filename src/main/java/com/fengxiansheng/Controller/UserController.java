package com.fengxiansheng.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fengxiansheng.Common.Result;
import com.fengxiansheng.Entity.User;
import com.fengxiansheng.Service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    /**
     * 新增用户
     *
     */
    @PostMapping
    public Result save(@RequestBody User user){
       userService.save(user);
        return Result.success();
    }
    /**
     * 修改用户
     *
     */
    @PutMapping
    public Result updatebyid(@RequestBody User user){
        userService.updateById(user);
        return Result.success();
    }
    /**
     * 查询单个用户
     *
     */
    @GetMapping("/{id}")
    public  Result getone(@PathVariable long id){
        return Result.success(userService.getById(id));
    }
    /* *
       查询所有用户
     */
    @GetMapping()
    public  Result getall(){
        return Result.success(userService.list());
    }
    @GetMapping("/page")
    public Result getbypages(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10") Integer pageSize){
        return Result.success(
                userService.page(new Page<>(pageNum,pageSize)));
    }
    /*
    删除用户
     */
    @DeleteMapping("/{id}")
    public  Result delete(@PathVariable long id){
        userService.removeById(id);
        return Result.success();
    }
}
