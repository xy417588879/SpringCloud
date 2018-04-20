package com.xuye.hello;

/*
@RunWith(SpringJUnit4ClassRunner.class) //引入Spring对JUnit4的支持
@SpringApplicationConfiguration(classes = HelloApplication.class) //指定Spring Boot 的启动类
@WebAppConfiguration //开启Web应用的配置，用于模拟ServletContext

*/
public class HelloApplicationTests {
/*
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
*/
}
