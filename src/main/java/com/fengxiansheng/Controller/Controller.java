package com.fengxiansheng.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/index")
public class Controller {
    @RequestMapping ("/hello")
    public String hello(){
        return "hello world";
    }
//    @GetMapping
//    public String index(){
//        return "无参方法实现";
//    }
    @GetMapping("/{id}")
    public String index(@PathVariable long id){
        System.out.printf("int is %s/n",id);
        return "GET Restful";
    }
    @GetMapping
    public String index2(@RequestParam long id ,@RequestParam String name){
        System.out.printf("int is %s,name=%s/n",id,name);
        return "GET 普通请求传值已经实现了";
    }
    @PostMapping
    public String sava(@RequestBody Map<String,String> map){
        System.out.printf(map.toString());
        return "post请求";
    }
    @PutMapping("/{id}")
    public String save2(@PathVariable long id,@RequestBody Map<String,String> map){
        System.out.printf("int is %s,name=%s/n",id,map);
        return "put成功";
    }
    @DeleteMapping("/{id}")
    public String save3(@PathVariable long id){
        System.out.printf("int is %s,/n",id);
        return "delete成功";
    }
}
