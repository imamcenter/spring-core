package tentang.tech.springcore.service;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AuthService implements ApplicationContextAware, BeanNameAware {

  @Getter
  private String beanName;
  @Getter
  private ApplicationContext applicationContext;

  @Override
  public void setBeanName(String s) {
    this.beanName = s;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
