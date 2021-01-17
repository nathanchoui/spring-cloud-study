package com.github.nathan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author nathan.z
 * @date 2020/12/27.
 */
@Slf4j
public class SpringTest {

    /**
     * BeanFactory, Spring的最顶层的抽象
     *
     * Resource 是对于最底层资源的抽象
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        // 对资源的抽象
        Resource resource = new ClassPathResource("application-context.xml");
        // 创建BeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        // bang
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        // 读取解析资源，转换成bean，放到beanFactory中
        beanDefinitionReader.loadBeanDefinitions(resource);
        // 通过工厂获取bean
        Student student = defaultListableBeanFactory.getBean(Student.class);
        System.out.println(student);
    }
}
