package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.MotionDao;
import xmut.graduate.dailyfit.dao.PlanDao;
import xmut.graduate.dailyfit.dao.UserDao;
import xmut.graduate.dailyfit.pojo.Motion;
import xmut.graduate.dailyfit.pojo.Plan;
import xmut.graduate.dailyfit.service.PlanService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private MotionDao motionDao;

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

    @Override
    public boolean findDefinitionByUsername(String username,String plan) {
        List<String> definitionList = new ArrayList<>();
        if(username !=null){
                Integer uid = userDao.findIdByName(username);
                definitionList = planDao.findDefinitionById(uid);
                for(int i=0;i<definitionList.size();i++){
                    if(definitionList.get(i).equals(plan)){
                        return true;
                    }
                }
                return false;
        }
        else {
            throw new RuntimeException("用户名不能为空");
        }
    }

    @Override
    public List<Plan> findAllByUsername(String username) {
        List<Plan> planList = new ArrayList<>();
        if(username != null){
            Integer uid = userDao.findIdByName(username);
            planList =  planDao.findAllById(uid);
        }
        return planList;
    }

    @Override
    public List<Motion> findMotionBypid(Integer pid) {
        List<Motion> motions = new ArrayList<>();
        Plan plan = planDao.findMidByPid(pid);
        Integer mid1 = plan.getMid1();
        Motion motion1 = motionDao.findMotionByMid(mid1);
        motions.add(motion1);
        Integer mid2 = plan.getMid1();
        Motion motion2 = motionDao.findMotionByMid(mid2);
        motions.add(motion2);
        Integer mid3 = plan.getMid3();
        Motion motion3 = motionDao.findMotionByMid(mid3);
        motions.add(motion3);
        Integer mid4 = plan.getMid4();
        Motion motion4 = motionDao.findMotionByMid(mid4);
        motions.add(motion4);
        Integer mid5 = plan.getMid5();
        Motion motion5 = motionDao.findMotionByMid(mid5);
        motions.add(motion5);
        return motions;
    }

    @Override
    public Plan findMidByPid(Integer pid) {
        Plan plan = planDao.findMidByPid(pid);
        return plan;
    }
}
