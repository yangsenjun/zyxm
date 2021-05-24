package cn.tycoding.api.app.biz.controller;

import cn.tycoding.api.admin.api.entity.SysUser;
import cn.tycoding.api.app.biz.feign.UserService;
import cn.tycoding.api.app.biz.service.AppUserService;
import cn.tycoding.api.app.entity.TbAppUser;
import cn.tycoding.api.common.controller.BaseController;
import cn.tycoding.api.common.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author yangsj
 * @Date 2020/1/17 9:38
 */
@Slf4j
@RestController
@RequestMapping("/app/user")
@Api(value = "UserController", tags = {"用户信息管理接口"})
public class UserController extends BaseController {
    @Autowired
    private AppUserService appUserService;

    @GetMapping("/info/{openid}")
    @ApiOperation(value = "根据openid查询用户信息")
    @ApiImplicitParam(name = "openid", value = "openid", required = true, dataType = "String")
    public Result<TbAppUser> info(@PathVariable("openid") String openid) {
        log.info("test");
        return new Result<TbAppUser>(appUserService.findByOpenid(openid));
    }

    /**
     * 登录注册接口
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "登录和注册接口")
    @PostMapping
    @ApiImplicitParam(name = "user", value = "用户实体信息", required = true, dataType = "TbAppUser", paramType = "body")
    public Result loginAndRegister(@RequestBody TbAppUser user) {
        return new Result<TbAppUser>(appUserService.loginAndRegisterDeal(user));
    }



}
