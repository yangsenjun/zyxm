package cn.tycoding.api.app.biz.service.impl;

import cn.tycoding.api.admin.api.entity.SysUser;
import cn.tycoding.api.admin.api.feign.RemoteUserService;
import cn.tycoding.api.app.biz.feign.UserService;
import cn.tycoding.api.app.biz.mapper.TbAppUserMapper;
import cn.tycoding.api.app.biz.service.AppUserService;
import cn.tycoding.api.app.entity.TbAppUser;
import cn.tycoding.api.common.utils.BaseConstants;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author yangsj
 * @Date 2020/1/17 9:49
 */
@Slf4j
@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private TbAppUserMapper tbAppUserMapper;
    @Autowired
    UserService userService;

    @Override
    public TbAppUser findByOpenid(String openid) {
        Example example = new Example(TbAppUser.class);
        example.createCriteria().andCondition("openid=", openid);
        List<TbAppUser> list = tbAppUserMapper.selectByExample(example);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    @LcnTransaction
    @Transactional
    public TbAppUser loginAndRegisterDeal(TbAppUser user) {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("998334");
        sysUser.setPassword("1323");
        userService.add(sysUser);

        Example example = new Example(TbAppUser.class);
        example.createCriteria().andCondition("openid=", user.getOpenid());
        List<TbAppUser> list = tbAppUserMapper.selectByExample(example);
        if(list==null || list.size() == BaseConstants.ZERO){
            tbAppUserMapper.insertUseGeneratedKeys(user);

            sysUser = new SysUser();
            sysUser.setUsername("9983345");
            sysUser.setPassword("13236");
            userService.add(sysUser);

            return user;
        }
        return null;
    }
}
