package cn.sun.happygou.controller;

import cn.sun.happygou.domain.Employee;
import cn.sun.happygou.util.AjaxResult;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    /**
     * RequestBody:用于接收页面请求体中的对象值，绑定到一个对象上
     * @param employee
     * @return
     */
    // restful:地址尽量不用动词:  获取一个员工: localhost:8001/employee/getById?id
    // @RequestBody 把请求的body中的数据,springmvc的原理封装进去

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else{
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }
}