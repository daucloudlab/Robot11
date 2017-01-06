package kz.kaznitu.lessons.models.sony;


import kz.kaznitu.lessons.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
public class SonyHand implements Hand {

    public SonyHand() {
    }

    public void catchSomething(){
        System.out.println("Catched from Sony!!");
    }

}