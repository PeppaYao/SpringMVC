package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//是为了让Spring IOC容器初始化时自动扫描到
@Controller
public class HelloController {
    //映射请求路径
    @RequestMapping("/hellow")
    public String hellow(Model model){  //变量名是和jsp的包名一致的
        //封装数据
        //向模型中添加msg属性和值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello_spring");
        return "hellow"; //会被视图解析器处理 WEB-INF/jsp/hellow.jsp
    }
}
