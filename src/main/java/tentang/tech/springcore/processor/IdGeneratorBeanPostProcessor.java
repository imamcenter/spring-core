package tentang.tech.springcore.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import tentang.tech.springcore.aware.IdAware;

import java.util.UUID;


@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor, Ordered {


  @Override
  public int getOrder() {
    return 1;
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    log.info("id generator processor for bean {}", beanName);
    if (bean instanceof IdAware) {
      log.info("Set id generator processor for bean {}", beanName);
      IdAware idAware = (IdAware) bean;
      idAware.setId(UUID.randomUUID().toString());
    }
    return bean;
  }
}
