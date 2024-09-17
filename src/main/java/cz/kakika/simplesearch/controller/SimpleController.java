package cz.kakika.simplesearch.controller;

import cz.kakika.simplesearch.model.HelloResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequestMapping()
public class SimpleController {

    @GetMapping("")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("apiKey","AIzaSyDYSDCDFNmAfAhSn4rzj0K4gUeFnhJ7aEY");
        modelAndView.addObject("cx","a1341dd99cf7f420c");
        return modelAndView;
    }


    @GetMapping("/hello")
    @ResponseBody
    public HelloResponse hello() {
        return HelloResponse.builder()
                .message("Hello, World!")
                .build();
    }
}
