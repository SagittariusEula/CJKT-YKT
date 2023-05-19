package it.internet.ykt.order.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import it.internet.cjkt.model.order.OrderInfo;
import it.internet.cjkt.model.vod.Course;
import it.internet.cjkt.vo.order.OrderFormVo;
import it.internet.cjkt.vo.order.OrderInfoQueryVo;
import it.internet.cjkt.vo.order.OrderInfoVo;
import it.internet.cjkt.vo.vod.CourseQueryVo;
import it.internet.result.Result;
import it.internet.ykt.order.controller.OrderInfoController;
import it.internet.ykt.order.service.OrderInfoService;
//import it.internet.ykt.vod.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/order/orderInfo")
public class OrderInfoApiController {

    @Autowired
    private OrderInfoService orderInfoService;

//    @Autowired
//    private CourseService courseService;

    //生成订单方法
    @PostMapping("submitOrder")
    public Result submitOrder(@RequestBody OrderFormVo orderFormVo) {
        Long orderId = orderInfoService.submitOrder(orderFormVo);
        return Result.ok(orderId);
    }

    @ApiOperation(value = "获取")
    @GetMapping("getInfo/{id}")
    public Result getInfo(@PathVariable Long id) {
        OrderInfoVo orderInfoVo = orderInfoService.getOrderInfoById(id);
        return Result.ok(orderInfoVo);
    }

    @ApiOperation(value = "课程")
    @GetMapping("cour")
    public Result FindCour(){
        List<OrderInfo> list = orderInfoService.list();
        return Result.ok(list);
    }

    @ApiOperation(value = "获取分页列表")
    @GetMapping ("{page}/{limit}")
    public Result indexs(@ApiParam(name = "page", value = "当前页码", required = true)
                        @PathVariable Long page,
                        @ApiParam(name = "limit", value = "每页记录数", required = true)
                        @PathVariable Long limit,
                        @ApiParam(name = "orderInfoVo", value = "查询对象", required = false)
                        OrderInfoQueryVo orderInfoQueryVo){
        Page<OrderInfo> pageParam = new Page<>(page,limit);
        Map<String,Object> map = orderInfoService.findPageOrderInfo(pageParam, orderInfoQueryVo);
        return Result.ok(map);
    }
//    @ApiOperation("公众号查看我的全部课程")
//    @GetMapping("course/{page}/{limit}")
//    public Result FindCourseToWx(@PathVariable Long page,
//                                 @PathVariable Long limit,
//                                 CourseQueryVo queryVo){
//        Page<Course> pages = new Page<>(page,limit);
//        Map<String, Object> map = courseService.findPage(pages,queryVo);
//        return Result.ok(map);
//    }
}
