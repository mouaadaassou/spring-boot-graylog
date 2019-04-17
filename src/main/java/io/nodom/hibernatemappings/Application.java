package io.nodom.hibernatemappings;

import io.nodom.hibernatemappings.bean.TestBean;
import io.nodom.hibernatemappings.model.Product;
import io.nodom.hibernatemappings.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TestBean testBean1;
    @Autowired
    private TestBean testBean2;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @GetMapping("/products")
    public List<Product> products() {
        System.out.println(testBean1 == testBean2);
        return this.productRepository.findAll();
    }

}
