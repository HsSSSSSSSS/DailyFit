package xmut.graduate.dailyfit.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
    private Long goodsId;
    private String goodsName;
    private BigDecimal goodsPrice;
    private String goodsIntroduce;
    private String goodsImg1;
    private String goodsImg2;
    private String goodsImg3;
    private String goodsImg4;
    private String goodsImg5;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public String getGoodsImg1() {
        return goodsImg1;
    }

    public void setGoodsImg1(String goodsImg1) {
        this.goodsImg1 = goodsImg1;
    }

    public String getGoodsImg2() {
        return goodsImg2;
    }

    public void setGoodsImg2(String goodsImg2) {
        this.goodsImg2 = goodsImg2;
    }

    public String getGoodsImg3() {
        return goodsImg3;
    }

    public void setGoodsImg3(String goodsImg3) {
        this.goodsImg3 = goodsImg3;
    }

    public String getGoodsImg4() {
        return goodsImg4;
    }

    public void setGoodsImg4(String goodsImg4) {
        this.goodsImg4 = goodsImg4;
    }

    public String getGoodsImg5() {
        return goodsImg5;
    }

    public void setGoodsImg5(String goodsImg5) {
        this.goodsImg5 = goodsImg5;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsIntroduce='" + goodsIntroduce + '\'' +
                ", goodsImg1='" + goodsImg1 + '\'' +
                ", goodsImg2='" + goodsImg2 + '\'' +
                ", goodsImg3='" + goodsImg3 + '\'' +
                ", goodsImg4='" + goodsImg4 + '\'' +
                ", goodsImg5='" + goodsImg5 + '\'' +
                '}';
    }
}
