package org.koreait.exam03.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {
    public void send(String name, String message) {
        System.out.printf("%s님이 전달한 메세지: %s%n", name, message);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("초기화 단계 호출 - afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("소멸 단계 전 - destroy()");
    }
}
