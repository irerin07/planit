package com.tistory.irerin07.planit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 민경수
 * @description basic controller
 * @since 2022.09.04
 **********************************************************************************************************************/
@RestController
public class BasicController {

    @GetMapping(path = "/test")
    public void read() {

    }
}