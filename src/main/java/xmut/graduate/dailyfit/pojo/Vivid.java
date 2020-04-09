package xmut.graduate.dailyfit.pojo;

public class Vivid {
    private int vividid;
    private String vimg;
    private int count;

    @Override
    public String toString() {
        return "Vivid{" +
                "vividid=" + vividid +
                ", vimg='" + vimg + '\'' +
                ", count=" + count +
                '}';
    }

    public int getVividid() {
        return vividid;
    }

    public void setVividid(int vividid) {
        this.vividid = vividid;
    }

    public String getVimg() {
        return vimg;
    }

    public void setVimg(String vimg) {
        this.vimg = vimg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
