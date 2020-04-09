package xmut.graduate.dailyfit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xmut.graduate.dailyfit.pojo.Goods;
import xmut.graduate.dailyfit.service.GoodsService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    public Map<String,Object> findByAllGoods() {
        Map<String,Object> modelMap = new HashMap<>();
        List<Goods> goods = goodsService.findByAllGoods();
        modelMap.put("goodsList",goods);
        return modelMap;
    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public Map<String,Object> findGoodsById(Integer goodsId) {
        Map<String,Object> modelMap = new HashMap<>();
        Goods goods = goodsService.findGoodsById(goodsId);
        modelMap.put("goodsDetail",goods) ;
        return modelMap;
    }
}

