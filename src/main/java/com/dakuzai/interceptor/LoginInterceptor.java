package com.dakuzai.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {


    /**
     * false  拦截
     * true 通过放行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String user = (String) request.getSession().getAttribute("loginUser");
        System.out.println("=====LoginInterceptor=====");
        /** 未登录，不放行，并且跳转到登录页！*/
        if (user==null){
            request.setAttribute("msg","未登录，请先登录！");
            // response.sendRedirect() ; 重定向
            // 转发
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
            // 放行
            System.out.println("LoginInterceptor true");
            return true;
        }
    }

}
