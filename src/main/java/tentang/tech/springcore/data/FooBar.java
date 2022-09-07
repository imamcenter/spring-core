package tentang.tech.springcore.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@Data
public class FooBar {

  private Foo foo;
  private Bar bar;

}
