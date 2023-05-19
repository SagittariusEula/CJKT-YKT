package it.internet.ykt.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.user.UserInfo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-21
 */
public interface UserInfoService extends IService<UserInfo> {


    UserInfo getUserInfoOpenid(String openId);
}
