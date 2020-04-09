package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.DynamicDao;
import xmut.graduate.dailyfit.service.DynamicService;

@Service
public class DynamicServiceImpl implements DynamicService {

    @Autowired
    private DynamicDao dynamicDao;
}
