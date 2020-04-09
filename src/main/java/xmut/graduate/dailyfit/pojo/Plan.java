package xmut.graduate.dailyfit.pojo;

public class Plan {
    private int pid;
    private int mid;
    private int fate;

    @Override
    public String toString() {
        return "Plan{" +
                "pid=" + pid +
                ", mid=" + mid +
                ", fate=" + fate +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getFate() {
        return fate;
    }

    public void setFate(int fate) {
        this.fate = fate;
    }
}
