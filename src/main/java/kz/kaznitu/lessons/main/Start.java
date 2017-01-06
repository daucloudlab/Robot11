package kz.kaznitu.lessons.main;


import com.sun.javafx.sg.prism.NGShape;
import kz.kaznitu.lessons.interfaces.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all-context.xml") ;
        ModelT1000 terminator1 = (ModelT1000)context.getBean("model1") ;
        terminator1.action();

        ModelT1000 terminator2 = (ModelT1000)context.getBean("model3") ;
        terminator2.action();

    }
}
