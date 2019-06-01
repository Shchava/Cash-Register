package cashregister.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CashRegisterController {

    @RequestMapping("/")
    public String index(){
        return "start.jsp";
    }
}
