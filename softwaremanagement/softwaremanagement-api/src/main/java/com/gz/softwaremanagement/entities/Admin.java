package com.gz.softwaremanagement.entities;

import lombok.Data;

/**
 * @Description: Admin实体类
 * @Author: MrXu
 * @date: 2019/07/10
 */
@Data
public class Admin {
    private int adminId;            // 管理员ID
    private String adminName;       // 管理员姓名
    private String adminEmail;      // 管理员邮箱
    private String adminPassword;   // 管理员密码
}
