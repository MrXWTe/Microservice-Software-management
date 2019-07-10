package com.gz.softwaremanagement.dao;

import com.gz.softwaremanagement.entities.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 登录操作的DAO
 * @Author: MrXu
 * @date: 2019/7/10
 */

@Mapper
public interface LoginDao {

    /**
     * 根据admin_email和admin_email查询管理员对象
     * @param admin_email 管理员emial
     * @param admin_email 管理员密码
     * @return 查询的Admin对象
     */
    Admin selectAdminByEmailAndPassword(String admin_email, String admin_password);


}
