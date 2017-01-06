package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Head;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ToshibaHead implements Head {
    public ToshibaHead() {
    }

    public void calc(){
        System.out.println("Thinking about Toshiba...");
    }

}