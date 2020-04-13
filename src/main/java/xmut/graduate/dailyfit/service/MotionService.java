package xmut.graduate.dailyfit.service;

import xmut.graduate.dailyfit.pojo.Motion;

import java.util.List;

public interface MotionService {

    List<Motion> findMotionBySort(String type,String sort);
}
