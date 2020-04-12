package xmut.graduate.dailyfit.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmut.graduate.dailyfit.dao.OrderDao;
import xmut.graduate.dailyfit.dao.UserDao;
import xmut.graduate.dailyfit.pojo.Order;
import xmut.graduate.dailyfit.service.OrderService;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private UserDao userDao;


    @Override
    public boolean insertOrder(String username,Order order) {
        if(username != null){
            try{
                Integer uid = userDao.findIdByName(username);
                order.setUid(uid);
                order.setCreateTime(new Date());

                int effectNum =  orderDao.insertOrder(order);;
                if(effectNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("插入订单信息失败");
                }
            }catch (Exception e){
                throw new RuntimeException("插入订单信息失败"+e.getMessage());
            }
        }else{
            throw new RuntimeException("用户名不能为空");
        }
    }

    @Override
    public List<Order> orderList(String username) {
        Integer uid = userDao.findIdByName(username);
        List<Order> orders = orderDao.findAllById(uid);
        return  orders;
    }
}
