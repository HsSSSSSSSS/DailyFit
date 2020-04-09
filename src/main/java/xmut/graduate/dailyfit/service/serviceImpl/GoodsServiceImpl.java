package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.GoodsDao;
import xmut.graduate.dailyfit.pojo.Goods;
import xmut.graduate.dailyfit.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> findByAllGoods() {
        return goodsDao.findByAllGoods();
    }

    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public Goods findGoodsById(Integer goodsId){
        return goodsDao.findGoodsById(goodsId);
    }
}
