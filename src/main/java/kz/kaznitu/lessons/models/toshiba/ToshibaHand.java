package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Hand;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ToshibaHand implements Hand {
    public ToshibaHand() {
    }

    public void catchSomething(){
        System.out.println("Catched from Toshiba!");
    }

}