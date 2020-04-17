package xmut.graduate.dailyfit.pojo;

public class Plan {
    private Integer pid;
    private Integer mid1;
    private Integer mid2;
    private Integer mid3;
    private Integer mid4;
    private Integer mid5;
    private String fate;
    private Integer weekNum;
    private Integer uid;
    private String definition;
    private Integer totalFate;

    @Override
    public String toString() {
        return "Plan{" +
                "pid=" + pid +
                ", mid1=" + mid1 +
                ", mid2=" + mid2 +
                ", mid3=" + mid3 +
                ", mid4=" + mid4 +
                ", mid5=" + mid5 +
                ", fate='" + fate + '\'' +
                ", weekNum=" + weekNum +
                ", uid=" + uid +
                ", definition='" + definition + '\'' +
                ", totalFate=" + totalFate +
                '}';
    }

    public Integer getTotalFate() {
        return totalFate;
    }

    public void setTotalFate(Integer totalFate) {
        this.totalFate = totalFate;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getMid1() {
        return mid1;
    }

    public void setMid1(Integer mid1) {
        this.mid1 = mid1;
    }

    public Integer getMid2() {
        return mid2;
    }

    public void setMid2(Integer mid2) {
        this.mid2 = mid2;
    }

    public Integer getMid3() {
        return mid3;
    }

    public void setMid3(Integer mid3) {
        this.mid3 = mid3;
    }

    public Integer getMid4() {
        return mid4;
    }

    public void setMid4(Integer mid4) {
        this.mid4 = mid4;
    }

    public Integer getMid5() {
        return mid5;
    }

    public void setMid5(Integer mid5) {
        this.mid5 = mid5;
    }

    public String getFate() {
        return fate;
    }

    public void setFate(String fate) {
        this.fate = fate;
    }

    public Integer getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(Integer weekNum) {
        this.weekNum = weekNum;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
