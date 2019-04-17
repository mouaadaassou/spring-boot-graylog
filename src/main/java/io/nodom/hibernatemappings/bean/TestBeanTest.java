package io.nodom.hibernatemappings.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;



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
