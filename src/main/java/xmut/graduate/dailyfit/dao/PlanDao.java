package xmut.graduate.dailyfit.dao;

import org.apache.ibatis.annotations.Mapper;
import xmut.graduate.dailyfit.pojo.Plan;

import java.util.List;

@Mapper
public interface PlanDao {

    int insertPlan(Plan plan);

    List<String> findDefinitionById(Integer uid);

    List<Plan> findAllById(Integer uid);

    Plan findMidByPid(Integer pid);
}
