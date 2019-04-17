package io.nodom.hibernatemappings.bean;


import com.sun.deploy.net.protocol.ProtocolType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;


@Configuration
public class TestBeanTest {

//    @Bean
//    @Scope(scopeName = SCOPE_PROTOTYPE)
//    public TestBean testBean() {
//        System.out.println("\n0000000000000000000000");
//        System.out.println("Test Bean");
//        System.out.println("0000000000000000000000\n");
//        return new TestBean();
//    }

    @Bean
    @Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public TestBean testBean() {
        System.out.println("\n0000000000000000000000");
        System.out.println("Test Bean");
        System.out.println("0000000000000000000000\n");
        return new TestBean();
    }
}
