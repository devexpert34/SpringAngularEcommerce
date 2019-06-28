package com.techie.shoppingstore;

import com.techie.shoppingstore.config.AppSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableCaching
@Import(AppSecurityConfig.class)
public class NgSpringShoppingStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(NgSpringShoppingStoreApplication.class, args);
    }

}