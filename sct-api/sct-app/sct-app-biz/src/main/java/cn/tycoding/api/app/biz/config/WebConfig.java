package cn.tycoding.api.app.biz.config;

import cn.tycoding.api.app.biz.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author yangsj
 * @Date 2020/1/19 17:12
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Autowired
    private MyInterceptor myInterceptor;

    // 重写WebMvcConfigurerAdapter类的addInterceptors方法，添加自己的拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor);
    }
}
