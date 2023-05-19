package it.internet.ykt.vod.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import it.internet.cjkt.model.vod.VideoVisitor;
import it.internet.cjkt.vo.vod.VideoVisitorCountVo;

import java.util.List;

/**
 * <p>
 * 视频来访者记录表 Mapper 接口
 * </p>
 *
 * @author Qing
 * @since 2023-03-16
 */

public interface VideoVisitorMapper extends BaseMapper<VideoVisitor> {

    List<VideoVisitorCountVo> findCount(Long courseId, String startDate, String endDate);
}
