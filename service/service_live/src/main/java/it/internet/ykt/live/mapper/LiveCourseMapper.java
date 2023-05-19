package it.internet.ykt.live.mapper;

import it.internet.cjkt.model.live.LiveCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import it.internet.cjkt.vo.live.LiveCourseVo;

import java.util.List;

/**
 * <p>
 * 直播课程表 Mapper 接口
 * </p>
 *
 * @author Qing
 * @since 2023-03-24
 */
public interface LiveCourseMapper extends BaseMapper<LiveCourse> {
    //获取最近的直播
    List<LiveCourseVo> getLatelyList();
}
