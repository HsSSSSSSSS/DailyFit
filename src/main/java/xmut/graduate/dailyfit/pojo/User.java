package xmut.graduate.dailyfit.pojo;

public class User {
    private int uid;
    private String username;
    private String password;
    private String img;
    private int point;
    private int followed;
    private int pid;
    private String addr;
    private int vividid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getFollowed() {
        return followed;
    }

    public void setFollowed(int followed) {
        this.followed = followed;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getVividid() {
        return vividid;
    }

    public void setVividid(int vividid) {
        this.vividid = vividid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", img='" + img + '\'' +
                ", point=" + point +
                ", followed=" + followed +
                ", pid=" + pid +
                ", addr='" + addr + '\'' +
                ", vividid=" + vividid +
                '}';
    }
}
