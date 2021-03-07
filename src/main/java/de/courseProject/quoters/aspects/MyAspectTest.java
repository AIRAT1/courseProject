package de.courseProject.quoters.aspects;

import de.courseProject.CourseProjectApplication;
import de.courseProject.quoters.phase1.T1000;
import org.aspectj.lang.annotation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectTest {
    @Pointcut("execution (* de.courseProject.quoters.phase1.Quoter.sayQuote())")
    public void quoterPoint() {
    }

    @Before(value = "quoterPoint()")
    public void beforeQuote() {
        System.out.println("Before with aspect");
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CourseProjectApplication.class);
        context.getBean(T1000.class).sayQuote();
    }
}
