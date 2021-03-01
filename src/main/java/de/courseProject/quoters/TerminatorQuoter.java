package de.courseProject.quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TerminatorQuoter implements Quoter {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println("message = " + message);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Quoter.class).sayQuote();
    }
}
