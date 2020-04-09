package xmut.graduate.dailyfit.pojo;

public class Message {
    private int uid;
    private double weight;
    private int height;
    private int e_week;
    private int e_daily;
    private String e_place;
    private String e_result;

    @Override
    public String toString() {
        return "Message{" +
                "uid=" + uid +
                ", weight=" + weight +
                ", height=" + height +
                ", e_week=" + e_week +
                ", e_daily=" + e_daily +
                ", e_place='" + e_place + '\'' +
                ", e_result='" + e_result + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getE_week() {
        return e_week;
    }

    public void setE_week(int e_week) {
        this.e_week = e_week;
    }

    public int getE_daily() {
        return e_daily;
    }

    public void setE_daily(int e_daily) {
        this.e_daily = e_daily;
    }

    public String getE_place() {
        return e_place;
    }

    public void setE_place(String e_place) {
        this.e_place = e_place;
    }

    public String getE_result() {
        return e_result;
    }

    public void setE_result(String e_result) {
        this.e_result = e_result;
    }
}
