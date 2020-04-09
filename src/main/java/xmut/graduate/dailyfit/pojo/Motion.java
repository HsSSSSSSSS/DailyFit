package xmut.graduate.dailyfit.pojo;

public class Motion {
    private int mid;
    private String source;
    private String level;
    private String sort;
    private String motion_title;

    @Override
    public String toString() {
        return "Motion{" +
                "mid=" + mid +
                ", source='" + source + '\'' +
                ", level='" + level + '\'' +
                ", sort='" + sort + '\'' +
                ", motion_title='" + motion_title + '\'' +
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getMotion_title() {
        return motion_title;
    }

    public void setMotion_title(String motion_title) {
        this.motion_title = motion_title;
    }
}
