package org.koreait.global.configs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSourceConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.addBasenames("messages.commons", "messages.validations");
        ms.setDefaultEncoding("UTF-8");

        ms.setUseCodeAsDefaultMessage(true); // 코드가 등록되어 있지 않으면 코드를 기본 문자열로 반환
        return ms;
    }
}
