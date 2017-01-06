package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Leg;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ToshibaLeg implements Leg {
    public ToshibaLeg() {
    }

    public void go(){
        System.out.println("Go to Toshiba!");
    }

}