package it.internet.ykt.vod.service;

import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.vod.VideoVisitor;

import java.util.Map;

/**
 * <p>
 * 视频来访者记录表 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-16
 */
public interface VideoVisitorService extends IService<VideoVisitor> {

    Map<String, Object> findCount(Long courseId, String startDate, String endDate);
}
