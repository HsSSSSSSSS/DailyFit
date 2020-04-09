package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xmut.graduate.dailyfit.service.DynamicService;

@Controller
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;
}
