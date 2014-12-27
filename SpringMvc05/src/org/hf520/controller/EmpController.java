package org.hf520.controller;

        import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 2014/12/27.
 */
@Controller
public class EmpController {
    @RequestMapping("/toUpdateEmp")
    public String toUpdate(Model model) {
        //去数据库加载原来输入的Emp信息
        Emp emp =new Emp();
        emp.setName("汪峰");
        emp.setAge(45);
        emp.setSex("F");
        emp.setDescr("渣渣");
        emp.setCity("bj");
        emp.setFavor("3");
        emp.setFoods(new String[]{"b","c"});
        model.addAttribute("emp", emp);
        return "updateEmp";
    }

    //加载喜欢城市选项,自动放入Model中
    @ModelAttribute("cityMap")
    public Map<String ,Object> getCities(){
        Map<String ,Object> cityMap=new HashMap<String, Object>();
        cityMap.put("bj","北京");
        cityMap.put("tj","天津");
        cityMap.put("sh","上海");
        cityMap.put("gz","广州");
        return cityMap;
    }
}
