package xmut.graduate.dailyfit.dao;

import org.apache.ibatis.annotations.Mapper;
import xmut.graduate.dailyfit.pojo.Plan;

@Mapper
public interface PlanDao {

    int insertPlan(Plan plan);
}
