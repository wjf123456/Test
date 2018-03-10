package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect

public class Audience {
//    @Pointcut("execution(* concert.Performance.perform(..))")
//    public void performance() {}
//    @Before("performance()")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//    @Before("performance()")
//    public void takeSeats() {
//        System.out.println("The audience is taking their seats.");
//    }
//    @AfterReturning("performance()")
//    public void applaud() {
//        System.out.println("CLAP CLAP CLAP CLAP CLAP");
//    }
//    @AfterThrowing("performance()")
//    public void demandRefund() {
//        System.out.println("Boo! We want our money back!");
//    }


//    @Before("execution(* concert.Performance.perform(..))")
//    public void silenceCellPhones() {
//        System.out.println("Silencing cell phones");
//    }
//    @Before("execution(* concert.Performance.perform(..))")
//    public void takeSeats() {
//        System.out.println("The audience is taking their seats.");
//    }
//    @AfterReturning("execution(* concert.Performance.perform(..))")
//    public void applaud() {
//        System.out.println("CLAP CLAP CLAP CLAP CLAP");
//    }
//    @AfterThrowing("execution(* concert.Performance.perform(..))")
//    public void demandRefund() {
//        System.out.println("Boo! We want our money back!");
//    }


@Pointcut("execution(* concert.Performance.perform(..))")
public void performance() {

}
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
    try{
        System.out.println("Silencing cell phones");
        System.out.println("The audience is taking their seats.");
        jp.proceed();
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    } catch (Throwable e) {
        System.out.println("Demanding a refund");
    }
}
}
