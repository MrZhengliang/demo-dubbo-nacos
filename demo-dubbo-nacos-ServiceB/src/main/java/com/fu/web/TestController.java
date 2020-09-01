package com.fu.web;


import com.fu.ServiceA;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    /**
     * dubbo注解，配置版本号，接口，集群容错，默认是否健康检查(false不检查,默认true)
     */
    @Reference(
            version = "1.0.0",
            interfaceClass = ServiceA.class,
            cluster = "failfast",
            check = false
    )
    private ServiceA serviceA;

    @GetMapping("/greet")
    public String greet(String name) {
        return serviceA.greet(name);
    }

}
