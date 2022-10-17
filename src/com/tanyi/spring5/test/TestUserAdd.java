package com.tanyi.spring5.test;

import com.tanyi.spring5.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestUserAdd
 * @Description spring5 使用xml格式创建bean 测试类
 * @Auther tanyi
 * @Date 2022/10/17
 * @Version 1.0
 **/
public class TestUserAdd {

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);

        user.add();
    }
}
