package tentang.tech.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.data.Bar;
import tentang.tech.springcore.data.Foo;

public class ComponentScanTest {
//  private ConfigurableApplicationContext context;
  private ApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
//    context.registerShutdownHook();
  }

  @Test
  void testImport() {

    Foo foo = context.getBean(Foo.class);
    Bar bar = context.getBean(Bar.class);
  }
}
