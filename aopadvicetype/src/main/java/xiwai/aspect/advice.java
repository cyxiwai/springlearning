package xiwai.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class advice {
    @Pointcut("execution(void *..save())")
    public void pt() {
    }

    @Pointcut("execution(int xiwai.*.*.select())")
    public void pt2() {
    }

    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }

    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }

    @Around("pt2()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
//        pjp.proceed();
        Object ret = pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
    }

    @AfterReturning("pt2()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }
//    @AfterThrowing()
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
