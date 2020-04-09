package xmut.graduate.dailyfit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xmut.graduate.dailyfit.pojo.Goods;
import xmut.graduate.dailyfit.pojo.User;
import xmut.graduate.dailyfit.service.GoodsService;
import xmut.graduate.dailyfit.service.UserService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class DailyfitApplicationTests {

    @Autowired
    private UserService userService;

    @Autowired
    private GoodsService goodsService;

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

}
