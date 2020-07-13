package mySpringPractice.SpringDI.Services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    //@Override
    public Object PostProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        return bean;
    }

}
