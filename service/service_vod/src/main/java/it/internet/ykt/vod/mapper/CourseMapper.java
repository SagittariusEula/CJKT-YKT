package it.internet.ykt.vod.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import it.internet.cjkt.model.vod.Course;
import it.internet.cjkt.vo.vod.CoursePublishVo;
import it.internet.cjkt.vo.vod.CourseVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author Qing
 * @since 2023-03-13
 */
public interface CourseMapper extends BaseMapper<Course> {
    //根据id获取课程发布信息
    CoursePublishVo selectCoursePublishVoById(Long id);

    CourseVo selectCourseVoById(Long id);
}
