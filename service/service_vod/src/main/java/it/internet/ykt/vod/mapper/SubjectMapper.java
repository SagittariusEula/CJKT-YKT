package it.internet.ykt.vod.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import it.internet.cjkt.model.vod.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 课程科目 Mapper 接口
 * </p>
 *
 * @author Qing
 * @since 2023-03-13
 */
@Repository
public interface SubjectMapper extends BaseMapper<Subject> {
    //查询下一层课程分类
    List<Subject> findChildSubject(Long id);

}
