package de.courseProject.quoters.phase1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class T1000 extends TerminatorQuoter implements Quoter{
    @Override
    @PostConstruct
    public void sayQuote() {
        System.out.println("Я ЖИДКИЙ");
    }
}
