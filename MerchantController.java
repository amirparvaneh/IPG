package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerchantController<MerchantService> {

    @Autowired
    private MerchantService service;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/addMerchant")
    public String addMerchant() {
        return "addMerchant";
    }

    @PostMapping("/addMerchant")
    public String addMerchant(@RequestParam String id, @RequestParam String name) {
       // service.addMerchant(id, name);
        return "addMerchant";
    }
}