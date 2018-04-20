package com.xuye.hello.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient client;//从服务注册中心获取的服务相关信息

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = this.client.getLocalServiceInstance();
        this.logger.info("/client,host:" + instance.getHost() + ",service_id:" + instance.getServiceId());
        return "hello word";
    }

}
