### SpringMVC
[视频链接](https://www.bilibili.com/video/BV1aE41167Tu?p=4)

模型：DAO和Service

视图：JSP

控制器：Servlet
### /和/*的区别
- /表示匹配所有不含jsp页面的请求
- /*表示匹配所有的请求，包括jsp页面
### SpringMVC的步骤
- 在web.xml中配置DispatcherServlet，servlet和servlet-mapping
### 控制器
控制器负责解析用户的请求并将其转换为一个模型。
实现控制器：一个控制器只能实现一个方法。
注解控制器：一个控制器可以包含多个请求处理的方法。
视图可以被复用。