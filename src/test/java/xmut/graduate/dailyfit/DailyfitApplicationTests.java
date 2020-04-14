package xmut.graduate.dailyfit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xmut.graduate.dailyfit.dao.MotionDao;
import xmut.graduate.dailyfit.dao.OrderDao;
import xmut.graduate.dailyfit.dao.PlanDao;
import xmut.graduate.dailyfit.pojo.*;
import xmut.graduate.dailyfit.service.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class DailyfitApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private MotionService motionService;

    @Autowired
    private PlanService planService;

    @Test
    void contextLoads() {
       User user = userService.adminLogin("admin","admin");

        if(user != null){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }

    }

    @Test
    void goodsTest(){
        List<Goods> goods = goodsService.findByAllGoods();
    }

    @Test
    void goodsDetailTest(){
        Goods goods = goodsService.findGoodsById(2);
        System.out.println(goods);
    }

    @Test
    void addGoodsTest(){
        Goods goods = new Goods();
//        goods.setGoodsImg("huashufhdaknfkja");
//        goods.setGoodsName("后爱德华发酵的看见女");
//        goods.setGoodsIntroduce(" ");
//        goods.setGoodsPrice(BigDecimal.valueOf(99.00));
        goodsService.addGoods(goods);
    }
    @Test
    void insertUser(){
        User user = new User();
        user.setUsername("啦啦啦");
        user.setImg("inininininininin");
        user.setAddr("福建省厦门市集美区");
        userService.insertUser(user);
        System.out.println("插入成功");
    }


    @Test
    void insertOrder(){
        Order order = new Order();
        order.setOrderPrice(BigDecimal.valueOf(19.9));
        orderService.insertOrder("Hs-",order);
//        orderService.insertOrder("Hs-",order);
    }

    @Test
    void findOrderList(){
//        List<Order> orders = orderService.orderList("Hs-");
//        System.out.println(orders);
        List<Order> orders = orderDao.findAllById(12);
        System.out.println(orders);
    }

    @Test
    void findMotionBySort(){
        List<Motion> motions = motionService.findMotionBySort("塑性","臀腿");
        System.out.println(motions);
    }
    @Test
    void insertPlan(){
        Plan plan = new Plan();
        plan.setMid1(6);
        plan.setMid2(7);
        plan.setMid3(8);
        plan.setMid4(9);
        plan.setMid5(10);
        planService.insertPlan("Hs-",plan);
    }

}
