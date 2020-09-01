package com.fu.service;

import com.fu.ServiceA;
import com.fu.ServiceB;
import org.apache.dubbo.config.annotation.Service;

//@Service(
//        version = "1.0.0",
//        interfaceClass = ServiceA.class,
//        cluster = "failfast",
//        loadbalance = "roundrobin"
//)
public class ServiceBImpl implements ServiceB {
    @Override
    public String greet(String name) {
        return "hello, " + name;
    }
}
