package cn.tycoding.api.app.biz.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Author yangsj
 * @Date 2020/1/19 17:08
 */
@Component
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        request.setAttribute("startTime", System.currentTimeMillis());
        System.out.println(((HandlerMethod) handler).getBean().getClass().getName());  // 获取处理请求的类名称
        System.out.println(((HandlerMethod) handler).getMethod().getName());  // 获取处理请求的方法名
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
        long startTime = (long) request.getAttribute("startTime");
        System.out.println("my interceptor 耗时：" + (System.currentTimeMillis() - startTime));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        System.out.println("afterCompletion");
        long startTime = (long) request.getAttribute("startTime");
        System.out.println("my interceptor 耗时：" + (System.currentTimeMillis() - startTime));
        System.out.println("ex is " + e);
    }
}
