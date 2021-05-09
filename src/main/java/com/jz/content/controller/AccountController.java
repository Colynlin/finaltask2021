package com.jz.content.controller;

import cn.hutool.core.map.MapUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jz.content.entity.Userlogin;
import com.jz.content.service.UserloginService;
import com.jz.others.bean.Result;
import com.jz.others.dto.LoginDto;
import com.jz.others.tools.shiroUtils.JwtUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author ColynLin
 * @since 2020-10-19
 */
@RestController
public class AccountController {

    @Autowired
    UserloginService userloginService;

    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/login")
    public Result login(@Validated @RequestBody LoginDto loginDto, HttpServletResponse response) {
        //通过号码查询出 Userlogin 所有字段
        Userlogin userlogin = userloginService.getOne(new QueryWrapper<Userlogin>().eq("tel", loginDto.getTel()));
        Assert.notNull(userlogin, "用户不存在");
        //if(!userlogin.getPassword().equals(SecureUtil.md5(loginDto.getPassword()))){ return Result.fail("密码不正确"); }
        String jwt = jwtUtils.generateToken(userlogin.getId());
        response.setHeader("Authorization", jwt);
        response.setHeader("Access-control-Expose-Headers", "Authorization");
        new ObjectMapper().convertValue(userlogin, Map.class);
        return Result.success(
                /*MapUtil.builder()
                .put("id", userlogin.getId())
                .put("name", userlogin.getName())
                .put()
                .map()*/
                new ObjectMapper().convertValue(userlogin, Map.class)
        );
    }

    @RequiresAuthentication
    @GetMapping("/logout")
    public Result logout() {
        SecurityUtils.getSubject().logout();
        return Result.success(null);
    }

    /*@PostMapping("/login")
    public Result login(@Validated @RequestBody LoginDto loginDto, HttpServletResponse response) {
        Userlogin userlogin = userloginService.getOne(new QueryWrapper<Userlogin>().eq("name", loginDto.getName()));
        Assert.notNull(userlogin, "用户不存在");
        if(!userlogin.getPassword().equals(SecureUtil.md5(loginDto.getPassword()))){ return Result.fail("密码不正确"); }
        String jwt = jwtUtils.generateToken(userlogin.getId());
        response.setHeader("Authorization", jwt);
        response.setHeader("Access-control-Expose-Headers", "Authorization");
        return Result.success(MapUtil.builder()
                .put("id", userlogin.getId())
                .put("name", userlogin.getName())
                .map()
        );
    }*/
}
