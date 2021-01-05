package pers.quzhiyu.dockerimage.helloworldimage.aspect;

import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MonitorAspect {
    @Before(value = "@within(pers.quzhiyu.dockerimage.helloworldimage.annotation.Monitor) || @annotation(pers.quzhiyu.dockerimage.helloworldimage.annotation.Monitor)")
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("Monitor注解before");
    }

    @After(value = "@within(pers.quzhiyu.dockerimage.helloworldimage.annotation.Monitor) || @annotation(pers.quzhiyu.dockerimage.helloworldimage.annotation.Monitor)")
    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("Monitor注解after");
    }
}