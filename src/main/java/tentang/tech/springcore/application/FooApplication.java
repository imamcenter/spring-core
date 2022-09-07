package tentang.tech.springcore.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import tentang.tech.springcore.data.Bar;
import tentang.tech.springcore.data.Foo;
import tentang.tech.springcore.listener.AppStartingListener;

import java.util.List;

@SpringBootApplication
public class FooApplication {

  @Bean
  public Foo foo() {
    return new Foo();
  }

//  public static void main(String[] args) {
//    ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println(foo);
//  }

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(FooApplication.class);
    springApplication.setListeners(List.of(new AppStartingListener()));
    ConfigurableApplicationContext applicationContext = springApplication.run(args);

    Foo bean = applicationContext.getBean(Foo.class);
    System.out.println(bean);
  }
}


