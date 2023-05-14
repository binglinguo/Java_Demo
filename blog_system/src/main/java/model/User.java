package model;
/**
 * @Author: 冰激凌
 * @Date: 2023-05-05 00:09
 **/
public class User {
    private int userId = 0;
    private String userName = "";
    private String passWord = "";

    public int getUserId () {
        return userId;
    }

    public void setUserId (int userId) {
        this.userId = userId;
    }

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public String getPassWord () {
        return passWord;
    }

    public void setPassWord (String passWord) {
        this.passWord = passWord;
    }
}
