package it.internet.ykt.wechat.service;

import com.baomidou.mybatisplus.extension.service.IService;
import it.internet.cjkt.model.wechat.Menu;
import it.internet.cjkt.vo.wechat.MenuVo;

import java.util.List;

/**
 * <p>
 * 订单明细 订单明细 服务类
 * </p>
 *
 * @author Qing
 * @since 2023-03-22
 */
public interface MenuService extends IService<Menu> {

    List<MenuVo> findMenuInfo();

    List<Menu> findMenuOneInfo();

    void syncMenu();

    void removeMenu();
}
