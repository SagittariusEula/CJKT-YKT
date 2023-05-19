package it.internet.ykt.vod.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.vod.Course;
import it.internet.cjkt.vo.vod.CourseFormVo;
import it.internet.cjkt.vo.vod.CoursePublishVo;
import it.internet.cjkt.vo.vod.CourseQueryVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-13
 */
public interface CourseService extends IService<Course> {

    Map<String, Object> findPage(Page<Course> pageParam, CourseQueryVo courseQueryVo);

    Long saveCourseInfo(CourseFormVo courseFormVo);

    //根据id获取课程信息
    CourseFormVo getCourseFormVoById(Long id);

    //根据id修改课程信息
    void updateCourseId(CourseFormVo courseFormVo);

    //根据id获取课程发布信息
    CoursePublishVo getCoursePublishVo(Long id);

    //根据id发布课程
    boolean publishCourseById(Long id);

    void removeCourseById(Long id);

    Map<String, Object> getInfoById(Long courseId);

    List<Course> findlist();
}
