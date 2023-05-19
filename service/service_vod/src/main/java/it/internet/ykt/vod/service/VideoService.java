package it.internet.ykt.vod.service;

import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.vod.Video;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-13
 */
public interface VideoService extends IService<Video> {

    void removeVideoByCourseId(Long id);

    void removeVideoById(Long id);
}
