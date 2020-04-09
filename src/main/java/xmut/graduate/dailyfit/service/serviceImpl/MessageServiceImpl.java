package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.MessageDao;
import xmut.graduate.dailyfit.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;
}

