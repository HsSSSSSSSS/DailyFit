package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xmut.graduate.dailyfit.pojo.Order;
import xmut.graduate.dailyfit.pojo.User;
import xmut.graduate.dailyfit.service.OrderService;
import xmut.graduate.dailyfit.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @RequestMapping("/insertOrder")
    public Map<String,Object> insertOrder(String username, Order order){
        Map<String,Object> modelmap = new HashMap<String,Object>();
        modelmap.put("success",orderService.insertOrder(username,order));
        return modelmap;
    }
    @RequestMapping("/orderList")
    public Map<String,Object> findAllOrdersByid(String username){
        Map<String,Object> modelmap = new HashMap<String,Object>();
        List<Order> orders = orderService.orderList(username);
        modelmap.put("orderList",orders);
        return modelmap;
    }
}
