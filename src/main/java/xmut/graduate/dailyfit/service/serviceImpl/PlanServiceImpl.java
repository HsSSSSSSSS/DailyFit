package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.PlanDao;
import xmut.graduate.dailyfit.dao.UserDao;
import xmut.graduate.dailyfit.pojo.Plan;
import xmut.graduate.dailyfit.service.PlanService;

import java.util.Date;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Autowired
    private UserDao userDao;

    @Override
    public boolean insertPlan(String username, Plan plan) {
        if (username != null) {
            try {
                Integer uid = userDao.findIdByName(username);
                plan.setUid(uid);
                int effectNum = planDao.insertPlan(plan);
                if (effectNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入计划失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入计划失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("用户名不能为空");
        }
    }
}
