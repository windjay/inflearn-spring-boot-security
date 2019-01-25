package com.windjay.springboot.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
  /**
   * 별다른 할일이 없다면... 쉽게 말해 뷰로만 보낼거면 아래와 같이 쓰면 된다....
   * @param registry
   */
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
//    registry.addViewController("/hello").setViewName("hello");
  }


}
