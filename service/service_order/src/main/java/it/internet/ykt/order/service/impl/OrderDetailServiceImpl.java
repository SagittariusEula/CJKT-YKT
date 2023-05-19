package it.internet.ykt.order.service.impl;

import it.internet.cjkt.model.order.OrderDetail;
import it.internet.ykt.order.mapper.OrderDetailMapper;
import it.internet.ykt.order.service.OrderDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单明细 订单明细 服务实现类
 * </p>
 *
 * @author Qing
 * @since 2023-03-20
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
