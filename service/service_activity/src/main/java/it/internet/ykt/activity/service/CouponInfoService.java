package it.internet.ykt.activity.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import it.internet.cjkt.model.activity.CouponInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.activity.CouponUse;
import it.internet.cjkt.vo.activity.CouponUseQueryVo;

/**
 * <p>
 * 优惠券信息 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-20
 */
public interface CouponInfoService extends IService<CouponInfo> {
    //获取已使用优惠券列表
    IPage<CouponUse> selectCouponUsePage(Page<CouponUse> pageParam, CouponUseQueryVo couponUseQueryVo);

    void updateCouponInfoUseStatus(Long couponUseId, Long orderId);
}