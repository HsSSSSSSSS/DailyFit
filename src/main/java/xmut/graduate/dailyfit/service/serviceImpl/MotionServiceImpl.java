package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.MotionDao;
import xmut.graduate.dailyfit.service.MotionService;

@Service
public class MotionServiceImpl implements MotionService {

    @Autowired
    private MotionDao motionDao;
}
