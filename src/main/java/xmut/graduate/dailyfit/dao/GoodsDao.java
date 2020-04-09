package xmut.graduate.dailyfit.dao;

import org.apache.ibatis.annotations.Mapper;
import xmut.graduate.dailyfit.pojo.Goods;

import java.util.List;

@Mapper
public interface GoodsDao {

    List<Goods> findByAllGoods();

    void addGoods(Goods goods);

    Goods findGoodsById(Integer goodsId);
}
