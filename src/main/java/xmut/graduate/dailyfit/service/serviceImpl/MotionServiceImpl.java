package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.MotionDao;
import xmut.graduate.dailyfit.pojo.Motion;
import xmut.graduate.dailyfit.service.MotionService;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotionServiceImpl implements MotionService {

    @Autowired
    private MotionDao motionDao;

    @Override
    public List<Motion> findMotionBySort(String type, String sort) {
        List<Motion> motions = new ArrayList<>();
        if(type == "塑形"){
            motions = motionDao.findMotionBySortDuctility(sort);
        }else{
            motions = motionDao.findMotionBySortWeight(sort);
        }

        return motions.size()<5?motions:motions.subList(0,5);
    }
}
