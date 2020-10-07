package com.beyki.service.common.dto;

import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;

@Component
public class AutowireHelper implements ApplicationContextAware {

    public static ApplicationContext applicationContext;

    private AutowireHelper() {

    }

    public static void autowire(Object classToAutowire) {
        AutowireHelper.applicationContext.getAutowireCapableBeanFactory().autowireBean(classToAutowire);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        AutowireHelper.applicationContext = applicationContext;
    }
}
