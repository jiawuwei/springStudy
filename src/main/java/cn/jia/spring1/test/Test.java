package cn.jia.spring1.test;

import cn.jia.spring1.entity.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jia on 2018/3/26.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context1.xml");
        Knight knight = (Knight) context.getBean("knight");
        System.out.println(knight.toString());
    }
}
