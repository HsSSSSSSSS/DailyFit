package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xmut.graduate.dailyfit.service.PlanService;

@Controller
public class PlanController {

    @Autowired
    private PlanService planService;
}
