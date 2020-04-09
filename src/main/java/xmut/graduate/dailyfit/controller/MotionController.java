package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xmut.graduate.dailyfit.service.MotionService;

@Controller
public class MotionController {

    @Autowired
    private MotionService motionService;
}
