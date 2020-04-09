package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xmut.graduate.dailyfit.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
}
