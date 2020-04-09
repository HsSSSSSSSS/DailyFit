package xmut.graduate.dailyfit.pojo;

import java.util.Date;

public class Order {
    private int order_id;
    private int uid;
    private String order_number;
    private float order_price;
    private int order_pay;
    private int is_send;
    private Date create_time;

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", uid=" + uid +
                ", order_number='" + order_number + '\'' +
                ", order_price=" + order_price +
                ", order_pay=" + order_pay +
                ", is_send=" + is_send +
                ", create_time=" + create_time +
                '}';
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public float getOrder_price() {
        return order_price;
    }

    public void setOrder_price(float order_price) {
        this.order_price = order_price;
    }

    public int getOrder_pay() {
        return order_pay;
    }

    public void setOrder_pay(int order_pay) {
        this.order_pay = order_pay;
    }

    public int getIs_send() {
        return is_send;
    }

    public void setIs_send(int is_send) {
        this.is_send = is_send;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
