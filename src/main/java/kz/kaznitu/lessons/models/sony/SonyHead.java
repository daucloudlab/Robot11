package kz.kaznitu.lessons.models.sony;


import kz.kaznitu.lessons.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
public class SonyHead implements Head {
    public SonyHead() {
    }

    public void calc(){
        System.out.println("Thinking about Sony...");
    }

}