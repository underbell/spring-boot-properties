package com.github.underbell.properties.configuration;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConfigurationPropertiesScan(basePackages = "com.github.underbell.properties.**.properties")
public class PropertiesConfiguration {}
