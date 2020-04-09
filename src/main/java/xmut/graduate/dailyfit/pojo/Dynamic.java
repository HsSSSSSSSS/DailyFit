package xmut.graduate.dailyfit.pojo;

import java.util.Date;

public class Dynamic {
    private int dynamic_id;
    private Date dynamic_time;
    private String dynamic_content;
    private String dynamic_img;
    private int uid;

    @Override
    public String toString() {
        return "Dynamic{" +
                "dynamic_id=" + dynamic_id +
                ", dynamic_time=" + dynamic_time +
                ", dynamic_content='" + dynamic_content + '\'' +
                ", dynamic_img='" + dynamic_img + '\'' +
                ", uid=" + uid +
                '}';
    }

    public int getDynamic_id() {
        return dynamic_id;
    }

    public void setDynamic_id(int dynamic_id) {
        this.dynamic_id = dynamic_id;
    }

    public Date getDynamic_time() {
        return dynamic_time;
    }

    public void setDynamic_time(Date dynamic_time) {
        this.dynamic_time = dynamic_time;
    }

    public String getDynamic_content() {
        return dynamic_content;
    }

    public void setDynamic_content(String dynamic_content) {
        this.dynamic_content = dynamic_content;
    }

    public String getDynamic_img() {
        return dynamic_img;
    }

    public void setDynamic_img(String dynamic_img) {
        this.dynamic_img = dynamic_img;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
