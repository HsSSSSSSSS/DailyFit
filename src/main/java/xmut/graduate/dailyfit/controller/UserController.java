package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xmut.graduate.dailyfit.pojo.Goods;
import xmut.graduate.dailyfit.pojo.User;
import xmut.graduate.dailyfit.service.GoodsService;
import xmut.graduate.dailyfit.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("hello")
    public String helloController(){
        return "hello";

    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/logincheck")
    public String logincheck(String username,String password){

        System.out.println("开始验证");
        User user = userService.adminLogin(username,password);

        if(user != null){
            System.out.println("验证成功");
            return "index";
        }else{
            System.out.println("验证失败");
            return "redirect:/login";
        }

    }

    @RequestMapping("/insertUser")
    public Map<String,Object> insertUser(@RequestBody User user){
        Map<String,Object> modelmap = new HashMap<String,Object>();
        modelmap.put("success",userService.insertUser(user));
        return modelmap;
    }

}
