package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xmut.graduate.dailyfit.pojo.Goods;
import xmut.graduate.dailyfit.pojo.Motion;
import xmut.graduate.dailyfit.pojo.Plan;
import xmut.graduate.dailyfit.service.PlanService;
import xmut.graduate.dailyfit.service.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
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

    @RequestMapping("/findDefinition")
    public Map<String,Object> findDefinition(String username, String plan){
        Map<String,Object> modelmap = new HashMap<String,Object>();
        boolean check = planService.findDefinitionByUsername(username,plan);
        modelmap.put("success",check);
        return modelmap;
    }

    @RequestMapping(value = "/planList",method = RequestMethod.GET)
    public Map<String,Object> findByAllPlan(String username) {
        Map<String,Object> modelMap = new HashMap<>();
        List<Plan> planList = planService.findAllByUsername(username);
        modelMap.put("planList",planList);
        return modelMap;
    }

    @RequestMapping(value = "/goToPlan",method = RequestMethod.GET)
    public Map<String,Object> goToPlan(Integer pid) {
        Map<String,Object> modelMap = new HashMap<>();
        List<Motion> motions = planService.findMotionBypid(pid);
        modelMap.put("motionList",motions);
        return modelMap;
    }

    @RequestMapping(value = "/plan",method = RequestMethod.GET)
    public Map<String,Object> plan(Integer pid) {
        Map<String,Object> modelMap = new HashMap<>();
        Plan plan = planService.findMidByPid(pid);
        modelMap.put("plan",plan);
        return modelMap;
    }
}
