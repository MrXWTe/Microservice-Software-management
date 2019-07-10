package com.gz.softwaremanagement.service;

import com.gz.softwaremanagement.entities.Admin;

/**
 * @Description: 登录操作的service接口
 * @Author: MrXu
 * @date: 2019/7/10
 */
public interface LoginService {

    /**
     * 根据admin_email和admin_email查询管理员对象
     * @param admin_email 管理员emial
     * @param admin_email 管理员密码
     * @return 查询的Administrator对象
     */
    Admin selectAdminByEmailAndPassword(String admin_email, String admin_password);
}
