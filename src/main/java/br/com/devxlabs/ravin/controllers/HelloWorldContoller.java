package br.com.devxlabs.ravin.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorldContoller {

    // usando arquivo html da pasta resources/templates
    @GetMapping("/helloWorld")
    public  String hellowWord(Model model) {
        model.addAttribute("message","Olá mundo teste!");
        return "helloWorld";//nome do aquivo html
    }

    // Com text plain
    @GetMapping("/helloWorldPlain")
    @ResponseBody
    public String helloWOrldPlain() {
        return "Teste hello world com text plain!";
    }

}
