package cn.tycoding.api.app.biz.feign;

import cn.tycoding.api.admin.api.entity.SysUser;
import cn.tycoding.api.admin.api.feign.fallback.RemoteUserServiceFallbackImpl;
import cn.tycoding.api.app.biz.feign.fallback.UserServiceFallbackImpl;
import cn.tycoding.api.common.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "sct-admin-biz",fallback = UserServiceFallbackImpl.class)
public interface UserService {
    /**
     * 根据用户名查找用户信息
     *
     * @return
     */
    @GetMapping("/user/info/{username}")
    Result<SysUser> info(@PathVariable("username") String username);

    @PostMapping("/user/info/add")
    Result<SysUser> add(@RequestBody SysUser user);
}
