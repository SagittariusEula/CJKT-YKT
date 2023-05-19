package it.internet.ykt.vod.controller;

import it.internet.result.Result;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value="admin/vod/user")
//@CrossOrigin
public class UserLoginController {
    /**
     * 登录
     * @return
     */
    @PostMapping("login")
    public Result Login(){
        Map<String,Object> map= new HashMap<>();
        map.put("token","admin-token");
        return Result.ok(map);
    }

    /**
     * 获取用户信息
     * @return
     */
    @GetMapping("info")
    public Result Info(){
        Map<String,Object> map = new HashMap<>();
        map.put("roles","admin");
        map.put("introduction","I am a super administrator");
        map.put("name","Super Admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    /**
     * 退出
     * @return
     */
    @PostMapping("logout")
    public Result Logout(){
        return Result.ok();
    }
}
