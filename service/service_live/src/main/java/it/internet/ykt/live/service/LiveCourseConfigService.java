package it.internet.ykt.live.service;

import it.internet.cjkt.model.live.LiveCourseConfig;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 直播课程配置表 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-24
 */
public interface LiveCourseConfigService extends IService<LiveCourseConfig> {
    //根据课程id查询配置信息
    LiveCourseConfig getCourseConfigCourseId(Long id);
}
