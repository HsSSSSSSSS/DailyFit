package xmut.graduate.dailyfit.service;

import xmut.graduate.dailyfit.pojo.Motion;
import xmut.graduate.dailyfit.pojo.Plan;

import java.util.List;

public interface PlanService {

    boolean insertPlan(String username, Plan plan);

    boolean findDefinitionByUsername(String username,String plan);

    List<Plan> findAllByUsername(String username);

    List<Motion> findMotionBypid(Integer pid);

    Plan findMidByPid(Integer pid);
}
