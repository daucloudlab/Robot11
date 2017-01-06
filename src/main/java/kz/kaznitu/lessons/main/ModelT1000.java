package kz.kaznitu.lessons.main;

import kz.kaznitu.lessons.interfaces.Hand;
import kz.kaznitu.lessons.interfaces.Head;
import kz.kaznitu.lessons.interfaces.Leg;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ModelT1000 extends BaseModel {

        private String color;
        private int year;
        private boolean soundEnabled;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1(){
        return new ModelT1000() ;
    }

    @Bean(name="model3")
    @Scope(value = "prototype")
    public ModelT1000 model2(){
        return new ModelT1000("Black", 2017, false) ;
    }

        public ModelT1000() {
        }

        public ModelT1000(Hand hand, Leg leg, Head head) {
            super(hand, leg, head);
        }

        public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
            super(hand, leg, head);
            this.color = color;
            this.year = year;
            this.soundEnabled = soundEnabled;
        }

        public ModelT1000(String color, int year, boolean soundEnabled) {
            this.color = color;
            this.year = year;
            this.soundEnabled = soundEnabled;
        }


        public void action() {
            getHead().calc();
            getHand().catchSomething();
            getLeg().go();
            System.out.println("color: " + color);
            System.out.println("year: " + year);
            System.out.println("can play sound: " + soundEnabled);
        }


        public void dance() {
            System.out.println("T1000 is dancing!");
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}