package kz.kaznitu.lessons.main;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPost implements BeanPostProcessor {
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println(o + " орнатылды");
        return o ;
    }

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
