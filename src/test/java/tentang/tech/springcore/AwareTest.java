package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import tentang.tech.springcore.service.AuthService;

public class AwareTest {
  private ConfigurableApplicationContext applicationContext;

  @Import({
      AuthService.class
  })
  static class TestConfiguration {

  }

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testAuth() {
    AuthService authService = applicationContext.getBean(AuthService.class);
    Assertions.assertEquals("tentang.tech.springcore.service.AuthService", authService.getBeanName());
    Assertions.assertNotNull(authService.getApplicationContext());
    Assertions.assertSame(applicationContext, authService.getApplicationContext());
  }
}
