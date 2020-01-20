package cn.tycoding.api.app.biz.feign.fallback;

import cn.tycoding.api.admin.api.entity.SysUser;
import cn.tycoding.api.app.biz.feign.UserService;
import cn.tycoding.api.common.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author yangsj
 * @Date 2020/1/19 17:24
 */
@Slf4j
@Component
public class UserServiceFallbackImpl implements UserService {
    @Override
    public Result<SysUser> info(String username) {
        log.error("查询用户信息失败，username >> {}", username);
        return null;
    }

    @Override
    public Result<SysUser> add(SysUser user) {
        log.error("新增用户信息失败，user >> {}", user);
        return null;
    }
}
