package com.example.candidaturebachend;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMapper {
    @Bean
    public DozerBeanMapper dozerBeanMapper()
    {
        return new DozerBeanMapper();
    }
}