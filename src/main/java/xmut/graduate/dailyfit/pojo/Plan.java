package xmut.graduate.dailyfit.pojo;

public class Plan {
    private Integer pid;
    private Integer mid1;
    private Integer mid2;
    private Integer mid3;
    private Integer mid4;
    private Integer mid5;
    private Integer fate;
    private Integer week;
    private Integer uid;

    @Override
    public String toString() {
        return "Plan{" +
                "pid=" + pid +
                ", mid1=" + mid1 +
                ", mid2=" + mid2 +
                ", mid3=" + mid3 +
                ", mid4=" + mid4 +
                ", mid5=" + mid5 +
                ", fate=" + fate +
                ", week=" + week +
                ", uid=" + uid +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getMid1() {
        return mid1;
    }

    public void setMid1(int mid1) {
        this.mid1 = mid1;
    }

    public int getMid2() {
        return mid2;
    }

    public void setMid2(int mid2) {
        this.mid2 = mid2;
    }

    public int getMid3() {
        return mid3;
    }

    public void setMid3(int mid3) {
        this.mid3 = mid3;
    }

    public int getMid4() {
        return mid4;
    }

    public void setMid4(int mid4) {
        this.mid4 = mid4;
    }

    public int getMid5() {
        return mid5;
    }

    public void setMid5(int mid5) {
        this.mid5 = mid5;
    }

    public int getFate() {
        return fate;
    }

    public void setFate(int fate) {
        this.fate = fate;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }
}
