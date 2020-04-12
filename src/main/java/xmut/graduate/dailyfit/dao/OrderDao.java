package xmut.graduate.dailyfit.dao;

import org.apache.ibatis.annotations.Mapper;
import xmut.graduate.dailyfit.pojo.Order;

import java.util.List;

@Mapper
public interface OrderDao {

    int insertOrder(Order order);

    List<Order> findAllById(Integer uid);
}
