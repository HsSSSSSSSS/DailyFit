package xmut.graduate.dailyfit.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private int orderId;
    private Integer uid;
    private String orderNumber;
    private BigDecimal orderPrice;
    private int orderPay;
    private int isSend;
    private Date createTime;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(int orderPay) {
        this.orderPay = orderPay;
    }

    public int getIsSend() {
        return isSend;
    }

    public void setIsSend(int isSend) {
        this.isSend = isSend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", uid=" + uid +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderPrice=" + orderPrice +
                ", orderPay=" + orderPay +
                ", isSend=" + isSend +
                ", createTime=" + createTime +
                '}';
    }
}
