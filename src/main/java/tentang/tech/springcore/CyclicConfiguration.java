package tentang.tech.springcore;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tentang.tech.springcore.data.cyclic.CyclicA;
import tentang.tech.springcore.data.cyclic.CyclicB;
import tentang.tech.springcore.data.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {

  @Bean
  public CyclicA cyclicA(CyclicB cyclicB) {
    return new CyclicA(cyclicB);
  }

  @Bean
  public CyclicB cyclicB(CyclicC cyclicC) {
    return new CyclicB(cyclicC);
  }

  @Bean
  public CyclicC cyclicC(CyclicA cyclicA) {
    return new CyclicC(cyclicA);
  }
}
