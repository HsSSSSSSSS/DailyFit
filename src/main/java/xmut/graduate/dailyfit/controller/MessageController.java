package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xmut.graduate.dailyfit.service.MessageService;

@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;
}
