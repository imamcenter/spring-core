package tentang.tech.springcore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tentang.tech.springcore.data.User;
import tentang.tech.springcore.event.LoginSuccessEvent;
import tentang.tech.springcore.listener.LoginAgainSuccessListener;
import tentang.tech.springcore.listener.LoginSuccessListener;
import tentang.tech.springcore.listener.UserListener;
import tentang.tech.springcore.service.UserService;

public class EventListenerTest {
private ConfigurableApplicationContext applicationContext;
  @Configuration
  @Import({
      UserService.class,
      LoginSuccessListener.class,
      LoginAgainSuccessListener.class,
      UserListener.class

  })
  static class TestConfighuration{

  }

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(TestConfighuration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void test() {
    UserService bean = applicationContext.getBean(UserService.class);
    bean.login("imam", "imam");
    bean.login("imam", "ihab");
    bean.login("kamil", "imam");
  }
}
