package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.VividDao;
import xmut.graduate.dailyfit.service.VividService;

@Service
public class VividServiceImpl implements VividService {

    @Autowired
    private VividDao vividDao;
}
