package org.koreait.proxy3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {
    @Pointcut("execution(* org.koreait.proxy.*.*(long))")
    public void publicTarget() {}
}
