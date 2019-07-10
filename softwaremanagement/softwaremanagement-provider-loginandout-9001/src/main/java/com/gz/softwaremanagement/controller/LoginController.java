package com.gz.softwaremanagement.controller;

import com.gz.softwaremanagement.entities.Admin;
import com.gz.softwaremanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Description: 登录操作的controller
 * @Author: MrXu
 * @date: 2019/7/10
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 获取管理员对象
     * @param admin_email 管理员Email
     * @param admin_password 管理员密码
     * @param map
     * @param session
     * @return 管理员对象json
     */
    @RequestMapping("/adminLogin")
    public Admin adminLogin(@RequestParam("admin_email") String admin_email,
                            @RequestParam("admin_password") String admin_password,
                            Map<String, Object> map,
                            HttpSession session)
    {
        Admin adminLogged = (Admin) session.getAttribute("admin");
        if (adminLogged != null) {
            return null;
        }

        Admin admin = loginService.selectAdminByEmailAndPassword(admin_email, admin_password);
        if(admin == null) return null;

        return admin;
    }
}
