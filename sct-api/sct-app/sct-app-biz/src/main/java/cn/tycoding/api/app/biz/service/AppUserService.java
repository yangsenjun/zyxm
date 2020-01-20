package cn.tycoding.api.app.biz.service;

import cn.tycoding.api.admin.api.entity.SysUser;
import cn.tycoding.api.app.entity.TbAppUser;

public interface AppUserService {
    TbAppUser findByOpenid(String openid);

    TbAppUser loginAndRegisterDeal(TbAppUser user);
}
