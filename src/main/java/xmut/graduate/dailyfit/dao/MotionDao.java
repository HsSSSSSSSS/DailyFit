package xmut.graduate.dailyfit.dao;

import org.apache.ibatis.annotations.Mapper;
import xmut.graduate.dailyfit.pojo.Motion;

import java.util.List;

@Mapper
public interface MotionDao {

    List<Motion> findMotionBySortDuctility(String sort);

    List<Motion> findMotionBySortWeight(String sort);

    Motion findMotionByMid(Integer mid);

}
