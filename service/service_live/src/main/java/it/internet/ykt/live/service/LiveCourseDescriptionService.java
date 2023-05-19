package it.internet.ykt.live.service;

import it.internet.cjkt.model.live.LiveCourseDescription;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 课程简介 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-24
 */
public interface LiveCourseDescriptionService extends IService<LiveCourseDescription> {
    //获取直播课程描述信息
    LiveCourseDescription getLiveCourseById(Long id);
}
