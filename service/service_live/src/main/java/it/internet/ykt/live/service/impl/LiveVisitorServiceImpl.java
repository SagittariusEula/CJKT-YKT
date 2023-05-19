package it.internet.ykt.live.service.impl;

import it.internet.cjkt.model.live.LiveVisitor;
import it.internet.ykt.live.mapper.LiveVisitorMapper;
import it.internet.ykt.live.service.LiveVisitorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 直播来访者记录表 服务实现类
 * </p>
 *
 * @author Qing
 * @since 2023-03-24
 */
@Service
public class LiveVisitorServiceImpl extends ServiceImpl<LiveVisitorMapper, LiveVisitor> implements LiveVisitorService {

}
