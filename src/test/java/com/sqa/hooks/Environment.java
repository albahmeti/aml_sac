package com.sqa.hooks;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@PropertySource("classpath:config.properties")
@Configuration
public class Environment {

    @Value("${url}")
    private String url;

    @Value("${browser}")
    private String browser;

    @Value("${timeout}")
    private Long timeout;

    @Value("${page_timeout}")
    private Long page_timeout;

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;


}
