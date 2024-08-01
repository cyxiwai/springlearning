package xiwai.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class firstAdvice {
    //切入点语法
    @Pointcut("execution(void xiwai.dao.BookDao.update())")
    private void pt(){}
//    本质是代理
    @After("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {

//            System.out.println("数据层");
        }

        Long endTime = System.currentTimeMillis();
        //计算时间差
        Long totalTime = endTime - startTime;
        //输出信息
        System.out.println("执行万次消耗时间:" + totalTime + "ms");
    }

}
