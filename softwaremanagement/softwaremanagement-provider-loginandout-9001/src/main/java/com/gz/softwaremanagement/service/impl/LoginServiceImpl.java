package com.gz.softwaremanagement.service.impl;

import com.gz.softwaremanagement.dao.LoginDao;
import com.gz.softwaremanagement.entities.Admin;
import com.gz.softwaremanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 登录操作的service
 * @Author: MrXu
 * @date: 2019/7/10
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;


    /**
     * 根据admin_email和admin_email查询管理员对象
     * @param admin_email 管理员email
     * @param admin_email 管理员密码
     * @return 查询的Administrator对象
     */
    @Override
    public Admin selectAdminByEmailAndPassword(String admin_email, String admin_password) {
        Admin admin;
        try{
            admin = loginDao.selectAdminByEmailAndPassword(admin_email, admin_password);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return admin;
    }

}
