package com.xuye.hello;

//手动引入，让status，content，equalTo函数可用
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//手动引入，让status，content，equalTo函数可用

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.xuye.hello.controller.HelloController;

@RunWith(SpringJUnit4ClassRunner.class) //引入Spring对JUnit4的支持
@SpringApplicationConfiguration(classes = HelloApplication.class) //指定Spring Boot 的启动类
@WebAppConfiguration //开启Web应用的配置，用于模拟ServletContext
public class HelloApplicationTests {

    private MockMvc mvc;//用于模拟调用Controller的接口发起请求。

    @Before //Junit中定义在测试类@Test 内容执行前预加载的内容
    public void setUp() throws Exception {
        this.mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();//初始化对HelloController的模拟
    }

    @Test
    public void hello() throws Exception {
        ResultActions andExpect = this.mvc.perform(MockMvcRequestBuilders.get("/hello")//perform 表示一次请求
                .accept(MediaType.APPLICATION_JSON))//accept 用于执行接受的数据类型
                .andExpect(status().isOk())//andExpect  用于判断返回的期望值
                .andExpect(content().string(equalTo("Hello World!")));//andExpect  用于判断返回的期望值

        System.out.println(andExpect.toString());
    }

}
