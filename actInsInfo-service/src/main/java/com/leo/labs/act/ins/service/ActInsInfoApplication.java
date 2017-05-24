package com.leo.labs.act.ins.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Created by leo on 2017/5/24.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ActInsInfoApplication {
    private static final String FACTORIES_RESOURCE_LOCATION="META-INF/spring.factories";
    public static void main(String[] args) {
        //
        String factoryClassName = ApplicationContextInitializer.class.getName();
        try {
            ClassLoader classLoader=Thread.currentThread().getContextClassLoader();
            Enumeration<URL> urls = (classLoader != null ? classLoader.getResources(FACTORIES_RESOURCE_LOCATION) :
                    ClassLoader.getSystemResources(FACTORIES_RESOURCE_LOCATION));
            List<String> result = new ArrayList<String>();
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                Properties properties = PropertiesLoaderUtils.loadProperties(new UrlResource(url));
                String factoryClassNames = properties.getProperty(factoryClassName);
                result.addAll(Arrays.asList(StringUtils.commaDelimitedListToStringArray(factoryClassNames)));
            }
        }
        catch (IOException ex) {
            throw new IllegalArgumentException("Unable to load ["  +
                    "] factories from location [" + FACTORIES_RESOURCE_LOCATION + "]", ex);
        }
        SpringApplication.run(ActInsInfoApplication.class,args);
    }
}
