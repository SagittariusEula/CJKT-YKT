package it.internet.ykt.vod.service;


import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.vod.Subject;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 课程科目 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-13
 */
public interface SubjectService extends IService<Subject> {

    List<Subject> selectList(Long id);

    /**
     * 导出
     * @param response
     */
    void exportData(HttpServletResponse response);

    void importDictData(MultipartFile file);
}
