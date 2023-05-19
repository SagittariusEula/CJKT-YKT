package it.internet.ykt.vod.service;


import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.vod.Chapter;
import it.internet.cjkt.vo.vod.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-13
 */
public interface ChapterService extends IService<Chapter> {

    List<ChapterVo> getNestedTreeList(Long courseId);

    void removeChapterByCourseId(Long id);
}
