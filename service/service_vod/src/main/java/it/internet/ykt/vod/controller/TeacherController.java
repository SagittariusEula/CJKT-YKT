package it.internet.ykt.vod.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import it.internet.cjkt.model.vod.Teacher;
import it.internet.cjkt.vo.vod.TeacherQueryVo;
import it.internet.result.Result;
import it.internet.ykt.vod.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author Qing
 * @since 2023-02-14
 */
@Api("讲师管理接口")
@RestController
@RequestMapping(value="admin/vod/teacher")
//@CrossOrigin //解决跨域问题
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @ApiOperation("查询所有讲师")
    @GetMapping("findAll")
    public Result findAll(){
        List<Teacher> list = teacherService.list();
        return Result.ok(list).message("查询数据成功");
    }

    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("{id}")
    public Result removeById(@ApiParam(name = "id",value = "id",required = true)
                               @PathVariable Long id){
        boolean isSuccess = teacherService.removeById(id);
        if (isSuccess){
            return Result.ok(null);
        }else {
            return Result.ok(null);
        }
    }

    //条件查询分页列表
    @ApiOperation(value = "获取分页列表")
    @PostMapping("{page}/{limit}")
    public Result index(
//            @ApiParam(name = "page", value = "当前页码", required = true)
            @PathVariable Long page,
//            @ApiParam(name = "limit", value = "每页记录数", required = true)
            @PathVariable Long limit,
//            @ApiParam(name = "teacherVo", value = "查询对象", required = false)
            @RequestBody(required = false) TeacherQueryVo teacherQueryVo) {
        //创建page对象，传递当前页和每页记录数
        Page<Teacher> pageParam = new Page<>(page, limit);
        if (teacherQueryVo == null){
            IPage<Teacher> pageModel = teacherService.page(pageParam, null);
            return Result.ok(pageModel);
        }else {
            //获取条件值
            String name = teacherQueryVo.getName();//讲师名称
            Integer level = teacherQueryVo.getLevel();//讲师级别
            String joinDateBegin = teacherQueryVo.getJoinDateBegin();//开始时间
            String joinDateEnd = teacherQueryVo.getJoinDateEnd();//结束时间
            //封装条件
            QueryWrapper<Teacher> wrapper = new QueryWrapper<>();
            if(!StringUtils.isEmpty(name)) {
                wrapper.like("name",name);
            }
            if(!StringUtils.isEmpty(level)) {
                wrapper.eq("level",level);
            }
            if(!StringUtils.isEmpty(joinDateBegin)) {
                wrapper.ge("join_date",joinDateBegin);
            }
            if(!StringUtils.isEmpty(joinDateEnd)) {
                wrapper.le("join_date",joinDateEnd);
            }
            //调用方法得到分页查询结果
            IPage<Teacher> pageModel = teacherService.page(pageParam, wrapper);
            return Result.ok(pageModel);
        }
    }

    @ApiOperation(value = "添加讲师")
    @PostMapping("saveTeacher")
    public Result saveTeacher(@RequestBody Teacher teacher){
        boolean isSuccess = teacherService.save(teacher);
        if (isSuccess){
            return Result.ok(null);
        }else {
            return Result.fail(null);
        }
    }

    @ApiOperation(value = "根据id查询讲师")
    @GetMapping ("get/{id}")
    public Result GetById(@PathVariable Long id){
        Teacher teacher = teacherService.getById(id);
        return Result.ok(teacher);
    }

    @ApiOperation(value = "修改讲师")
    @PutMapping("update")
    public Result updateTeacherById(@RequestBody Teacher teacher){
        boolean isSuccess = teacherService.updateById(teacher);
        if (isSuccess){
            return Result.ok(null);
        }else {
            return Result.fail(null);
        }
    }

    @ApiOperation(value = "根据id删除讲师接口")
    @DeleteMapping("bachRemove")
    public Result bachRemove(@RequestBody List<Long> idLest){
        boolean isSuccess = teacherService.removeByIds(idLest);
        if (isSuccess){
            return Result.ok(null);
        }else {
            return Result.fail(null);
        }
    }

    //5 修改-根据id查询
    //根据id查询 远程调用
    @ApiOperation("根据id查询")
    @GetMapping("inner/getTeacher/{id}")
    public Teacher getTeacherInfo(@PathVariable Long id) {
        Teacher teacher = teacherService.getById(id);
        return teacher;
    }

}

