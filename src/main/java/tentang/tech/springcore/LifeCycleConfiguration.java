package tentang.tech.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tentang.tech.springcore.data.Connection;
import tentang.tech.springcore.data.Server;

@Configuration
public class LifeCycleConfiguration {


  @Bean
  public Connection connection() {
    return new Connection();
  }

  //  @Bean(initMethod = "start", destroyMethod = "stop")
  @Bean
  public Server server() {
    return new Server();
  }
}
