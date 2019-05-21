package com.xxd.interceptor;

import com.xxd.annotation.PassToken;
import com.xxd.annotation.UserLoginToken;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String tocken = request.getHeader("tocken");
        // 如果不是映射到方法直接通过
        if(!(handler instanceof HandlerMethod))
        {
            return true;
        }
        HandlerMethod handlermethod  = (HandlerMethod) handler;
        Method method = handlermethod.getMethod();
        //检测方法是否有passToken注解，有则跳过
        if(method.isAnnotationPresent(PassToken.class))
        {
            PassToken passToken = method.getAnnotation(PassToken.class);
                    if(passToken.required())
                    {
                        return true;
                    }
        }
        //检测方法是否有UserLoginToken注解，有则进行tocken校验
        if(method.isAnnotationPresent(UserLoginToken.class))
        {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if(userLoginToken.required())
            {
                if(null == tocken || "".equals(tocken))
                {
                    throw new RuntimeException("无效的tocken,请重新登录");
                }
                String userId;

            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
