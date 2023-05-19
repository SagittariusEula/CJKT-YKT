package it.internet.ykt.live.service;

import it.internet.cjkt.model.live.LiveCourseGoods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 直播课程关联推荐表 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-24
 */
public interface LiveCourseGoodsService extends IService<LiveCourseGoods> {
    //查询直播课程商品列表
    List<LiveCourseGoods> getGoodsListCourseId(Long id);
}
