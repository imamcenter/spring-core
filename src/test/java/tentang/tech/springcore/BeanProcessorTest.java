package tentang.tech.springcore;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tentang.tech.springcore.data.Car;
import tentang.tech.springcore.processor.IdGeneratorBeanPostProcessor;

public class BeanProcessorTest {

  @Configuration
  @Import({
      Car.class,
      IdGeneratorBeanPostProcessor.class
  })
  public static class TestConfigration{

  }

  @Test
  void testCar() {
    ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfigration.class);
    Car c = applicationContext.getBean(Car.class);
    System.out.println(c.getId());
  }
}
