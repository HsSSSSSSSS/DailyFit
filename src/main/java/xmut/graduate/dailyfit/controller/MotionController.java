package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xmut.graduate.dailyfit.pojo.Goods;
import xmut.graduate.dailyfit.pojo.Motion;
import xmut.graduate.dailyfit.service.MotionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MotionController {

    @Autowired
    private MotionService motionService;

    @RequestMapping(value = "/motions",method = RequestMethod.GET)
    public Map<String,Object> findMotionBySort(String type,String sort) {
        Map<String,Object> modelMap = new HashMap<>();
        List<Motion> motions = motionService.findMotionBySort(type,sort);
        modelMap.put("motionsList",motions);
        return modelMap;
    }
}
