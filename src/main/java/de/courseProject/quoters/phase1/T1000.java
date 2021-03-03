package de.courseProject.quoters.phase1;

import javax.annotation.PostConstruct;

public class T1000 extends TerminatorQuoter implements Quoter{
    @Override
    @PostConstruct
    public void sayQuote() {
        System.out.println("Я ЖИДКИЙ");
    }
}
