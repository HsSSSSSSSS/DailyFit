package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xmut.graduate.dailyfit.service.VividService;

@Controller
public class VividController {

    @Autowired
    private VividService vividService;
}
