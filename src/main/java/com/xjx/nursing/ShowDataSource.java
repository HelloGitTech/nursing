package com.xjx.nursing;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ShowDataSource implements ApplicationContextAware {
    ApplicationContext ctx = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println("---------------------------");
        System.out.println(dataSource.getClass().getName());
        System.out.println("---------------------------");
    }
}
