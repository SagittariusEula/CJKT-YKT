package it.internet.ykt.live.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import it.internet.cjkt.model.live.LiveCourse;
import it.internet.cjkt.model.live.LiveCourseAccount;
import it.internet.cjkt.vo.live.LiveCourseConfigVo;
import it.internet.cjkt.vo.live.LiveCourseFormVo;
import it.internet.cjkt.vo.live.LiveCourseVo;
import it.internet.result.Result;
import it.internet.ykt.live.service.LiveCourseAccountService;
import it.internet.ykt.live.service.LiveCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 直播课程表 前端控制器
 * </p>
 *
 * @author Qing
 * @since 2023-03-24
 */
@RestController
@RequestMapping(value="/admin/live/liveCourse")
public class LiveCourseController {

    @Autowired
    private LiveCourseService liveCourseService;

    @Autowired
    private LiveCourseAccountService liveCourseAccountService;

    @ApiOperation(value = "获取最近的直播")
    @GetMapping("findLatelyList")
    public Result findLatelyList() {
        List<LiveCourseVo> list = liveCourseService.getLatelyList();
        return Result.ok(list);
    }

    @ApiOperation(value = "修改配置")
    @PutMapping("updateConfig")
    public Result updateConfig(@RequestBody LiveCourseConfigVo liveCourseConfigVo) {
        liveCourseService.updateConfig(liveCourseConfigVo);
        return Result.ok(null);
    }

    @ApiOperation(value = "获取直播账号信息")
    @GetMapping("getLiveCourseAccount/{id}")
    public Result getLiveCourseAccount(@PathVariable Long id) {
        LiveCourseAccount liveCourseAccount = liveCourseAccountService.getLiveCourseAccountCourseId(id);
        return Result.ok(liveCourseAccount);
    }

    @ApiOperation(value = "获取直播配置信息")
    @GetMapping("getCourseConfig/{id}")
    public Result getCourseConfig(@PathVariable Long id) {
        LiveCourseConfigVo liveCourseConfigVo = liveCourseService.getCourseConfig(id);
        return Result.ok(liveCourseConfigVo);
    }

    //id查询直播课程基本信息
    @GetMapping("get/{id}")
    public Result get(@PathVariable Long id) {
        LiveCourse liveCourse = liveCourseService.getById(id);
        return Result.ok(liveCourse);
    }

    //id查询直播课程基本信息和描述信息
    @GetMapping("getInfo/{id}")
    public Result getInfo(@PathVariable Long id) {
        LiveCourseFormVo liveCourseFormVo = liveCourseService.getLiveCourseVo(id);
        return Result.ok(liveCourseFormVo);
    }

    //更新直播课程方法
    @PutMapping("update")
    public Result update(@RequestBody LiveCourseFormVo liveCourseFormVo) {
        liveCourseService.updateLiveById(liveCourseFormVo);
        return Result.ok(null);
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("remove/{id}")
    public Result remove(@PathVariable Long id) {
        liveCourseService.removeLive(id);
        return Result.ok(null);
    }

    @ApiOperation("直播课程添加")
    @PostMapping("save")
    public Result save(@RequestBody LiveCourseFormVo liveCourseFormVo) {
        liveCourseService.saveLive(liveCourseFormVo);
        return Result.ok(null);
    }

    @ApiOperation("直播课程列表")
    @GetMapping("{page}/{limit}")
    public Result list(@PathVariable Long page,@PathVariable Long limit) {
        Page<LiveCourse> pageParam = new Page<>(page,limit);
        IPage<LiveCourse> pageModel = liveCourseService.selectPage(pageParam);
        return Result.ok(pageModel);
    }
}



