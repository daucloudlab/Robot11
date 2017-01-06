package kz.kaznitu.lessons.main;

import kz.kaznitu.lessons.interfaces.Hand;
import kz.kaznitu.lessons.interfaces.Head;
import kz.kaznitu.lessons.interfaces.Leg;
import kz.kaznitu.lessons.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


public abstract class BaseModel implements Robot {

    @Autowired
    @Qualifier("sonyHand")
    private Hand hand;

    @Autowired(required = false)
    @Qualifier(value = "toshibaLeg")
    private Leg leg;

    @Autowired
    @Qualifier("sonyHead")
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    public BaseModel(Hand hand, Leg leg, Head head) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

}