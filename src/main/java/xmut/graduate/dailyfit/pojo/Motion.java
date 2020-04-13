package xmut.graduate.dailyfit.pojo;

public class Motion {
    private int mid;
    private String source;
    private String levelNum;
    private String sort;
    private String motionTitle;

    @Override
    public String toString() {
        return "Motion{" +
                "mid=" + mid +
                ", source='" + source + '\'' +
                ", levelNum='" + levelNum + '\'' +
                ", sort='" + sort + '\'' +
                ", motionTitle='" + motionTitle + '\'' +
                '}';
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(String levelNum) {
        this.levelNum = levelNum;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getMotionTitle() {
        return motionTitle;
    }

    public void setMotionTitle(String motionTitle) {
        this.motionTitle = motionTitle;
    }
}
