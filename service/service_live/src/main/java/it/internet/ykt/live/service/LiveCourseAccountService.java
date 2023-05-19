package it.internet.ykt.live.service;

import it.internet.cjkt.model.live.LiveCourseAccount;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 直播课程账号表（受保护信息） 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-24
 */
public interface LiveCourseAccountService extends IService<LiveCourseAccount> {
    //获取直播账号信息
    LiveCourseAccount getLiveCourseAccountCourseId(Long id);

}
