package mySpringPractice.SpringDI.Services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("## Im in the constructor of the Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //this is just for the InitializingBean
        System.out.println("## LifeCycle has its properties set");
    }

    @Override
    public void destroy() throws Exception {
        //this is just for the disposableBean
        System.out.println("## The lifeCycle has been terminated");
    }


    @Override
    public void setBeanName(String name) {
        //this is just for the BeanNameAware
        System.out.println("## Bean name has been set and it's "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        //this is just for FactoryAware
        System.out.println("## Bean Factory has been set "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //this is just for ApplicationContextAware
        System.out.println("## Application context has been set "+applicationContext);
    }

    @PostConstruct
    public void postConstructMethod(){
        System.out.println("## The postConstruct has been call");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("## The preDestroy method has been call");
    }

}
