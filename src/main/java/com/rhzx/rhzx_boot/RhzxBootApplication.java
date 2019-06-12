package com.rhzx.rhzx_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RhzxBootApplication /*extends SpringBootServletInitializer*/ {
  /*  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RhzxBootApplication.class);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(RhzxBootApplication.class, args);
    }

}
