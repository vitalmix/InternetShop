package com.company.controll;


import com.company.data.User;
import com.company.repositories.ProductRepository;
import com.company.repositories.UserRepository;
import com.company.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    ProductRepository productRepository;

    

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("P_List", productRepository.findAll());
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showAddForm(){

        return "register";
    }
/*


    @RequestMapping(value = "/add", method = RequestMethod.GET)
        public String addUser(@ModelAttribute("user") User user){
        userService.createUser(user);
        return "add";
        }
*/

}
