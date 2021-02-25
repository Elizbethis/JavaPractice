package Second.Demo02.stuManager.global;

public class User {
    private int id;
    private String userName;
    private String password;
    private int state = 1;          //权限管理 0-管理员（增删改查） 1-普通用户

    public User(int id, String userName, String password, int state) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.state = state;
    }

    public User(String userName, String password, int state) {
        this.userName = userName;
        this.password = password;
        this.state = state;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                '}';
    }
}
