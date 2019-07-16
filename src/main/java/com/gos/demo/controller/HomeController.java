package com.gos.demo.controller;

import com.gos.demo.seller.EnumElementV2;
import com.gos.demo.seller.RefundPolicy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HomeController {

    @GetMapping("/")
    public String greeting(){
        return "hello";
    }

    @GetMapping("/code")
    public RefundPolicy[] getCodes(){
        return RefundPolicy.values();
    }

    @GetMapping("/v2/code")
    public List<RefundPolicy> getCodesV2(){
        List<RefundPolicy> policies = Arrays.stream(RefundPolicy.values()).collect(Collectors.toList());
        return policies;
    }
}
