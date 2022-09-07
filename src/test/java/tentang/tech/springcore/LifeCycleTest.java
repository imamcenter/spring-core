package tentang.tech.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tentang.tech.springcore.data.Connection;
import tentang.tech.springcore.data.Server;

public class LifeCycleTest {
  private ConfigurableApplicationContext context;

  @BeforeEach
  void setUp() {
    context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    context.registerShutdownHook();
  }

  @Test
  void testConnection() {
    Connection bean = context.getBean(Connection.class);
  }

  @Test
  void testServer() {
    Server bean = context.getBean(Server.class);
  }
}


