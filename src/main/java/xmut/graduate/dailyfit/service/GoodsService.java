package xmut.graduate.dailyfit.service;


import xmut.graduate.dailyfit.pojo.Goods;

import java.util.List;

public interface GoodsService {

    List<Goods> findByAllGoods();

    void addGoods(Goods goods);

    Goods findGoodsById(Integer goodsId);
}
