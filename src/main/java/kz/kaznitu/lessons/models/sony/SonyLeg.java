package kz.kaznitu.lessons.models.sony;


import kz.kaznitu.lessons.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component
public class SonyLeg implements Leg {
    public SonyLeg() {
    }

    public void go(){
        System.out.println("Go to Sony!");
    }

}