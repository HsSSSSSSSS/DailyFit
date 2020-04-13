package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xmut.graduate.dailyfit.pojo.Order;
import xmut.graduate.dailyfit.pojo.Plan;
import xmut.graduate.dailyfit.service.PlanService;
import xmut.graduate.dailyfit.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PlanController {

    @Autowired
    private PlanService planService;

    @Autowired
    private UserService userService;

    @RequestMapping("/insertPlan")
    public Map<String,Object> insertOrder(String username, Plan plan){
        Map<String,Object> modelmap = new HashMap<String,Object>();
        modelmap.put("success",planService.insertPlan(username,plan));
        return modelmap;
    }
}
