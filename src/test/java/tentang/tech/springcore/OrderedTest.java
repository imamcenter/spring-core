package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tentang.tech.springcore.data.Car;
import tentang.tech.springcore.processor.IdGeneratorBeanPostProcessor;
import tentang.tech.springcore.processor.PrefixIdGeneratorBeanPostProcessor;

public class OrderedTest {

  @Configuration
  @Import({
      Car.class,
      IdGeneratorBeanPostProcessor.class,
      PrefixIdGeneratorBeanPostProcessor.class
  })
  public static class TestConfigration {

  }

  @Test
  void testCar() {
    ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestConfigration.class);
    applicationContext.registerShutdownHook();
    Car c = applicationContext.getBean(Car.class);
    Assertions.assertNotNull(c.getId());
    Assertions.assertTrue(c.getId().startsWith("PZN-"));
  }
}
