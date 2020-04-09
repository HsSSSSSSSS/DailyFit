package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.PlanDao;
import xmut.graduate.dailyfit.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;
}
