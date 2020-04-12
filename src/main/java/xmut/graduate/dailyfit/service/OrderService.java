package xmut.graduate.dailyfit.service;

import xmut.graduate.dailyfit.pojo.Order;

import java.util.List;

public interface OrderService {

    boolean insertOrder(String username,Order order);

    List<Order> orderList(String username);
}
