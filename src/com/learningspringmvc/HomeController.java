package com.learningspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Vyacheslav_Potapenko
 * Date: 7/12/13
 * Time: 5:04 PM
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        System.out.println("HomeController: Passing through...");
        return "WEB-INF/views/home.jsp";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/emp/{id}",
            headers = "Accept=application/json")
    public
    @ResponseBody
    Employee getEmployee(@PathVariable String id) {
        Employee empl = new Employee();
        empl.setId(id);
        empl.setName("Some Name");
        return empl;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String form(Model model) {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("New employee");
        model.addAttribute(employee);
        return "WEB-INF/views/form.jsp";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/form2")
    public String form2(Model model) {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setName("New employee");
        model.addAttribute(employee);
        System.out.println("entered into /form2");
        return "WEB-INF/views/form2.jsp";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/form2Post")
    public String form2Post(Employee employee) {
        System.out.println("employee = [" + employee.getId() + ", " + employee.getName() + "]");
        return "WEB-INF/views/home.jsp";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setDisallowedFields("fake", "name");
    }
}
