package com.fu.service;

import com.fu.ServiceA;
import com.fu.dal.dao.UserMapper;
import com.fu.dal.dataobject.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(
        version = "1.0.0",
        interfaceClass = ServiceA.class,
        cluster = "failfast",
        loadbalance = "roundrobin"
)
public class ServiceAImpl implements ServiceA {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String greet(String name) {
        userMapper.insert(new User(name));
        return "hello, " + name;
    }
}
