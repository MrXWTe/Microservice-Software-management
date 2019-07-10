package entities;

import lombok.Data;

import java.util.Date;

/**
 * @Description: User实体类
 * @Author: MrXu
 * @date: 2019/07/10
 */
@Data
public class User {
    private int userId;             // 用户ID
    private String userName;        // 用户名
    private String userEmail;       // 用户Email
    private String userPassword;    // 用户密码
    private Date userEnrollDate;    // 用户注册时间
    private boolean userStatus;     // 用户是否在职
}
