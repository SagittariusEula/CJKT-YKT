package it.internet.ykt.order.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.order.OrderInfo;
import it.internet.cjkt.vo.order.OrderFormVo;
import it.internet.cjkt.vo.order.OrderInfoQueryVo;
import it.internet.cjkt.vo.order.OrderInfoVo;

import java.util.Map;

/**
 * <p>
 * 订单表 订单表 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-20
 */
public interface OrderInfoService extends IService<OrderInfo> {

    Map<String, Object> findPageOrderInfo(Page<OrderInfo> pageParam, OrderInfoQueryVo orderInfoQueryVo);

    Long submitOrder(OrderFormVo orderFormVo);

    OrderInfoVo getOrderInfoById(Long id);

    void updateOrderStatus(String out_trade_no);
}
