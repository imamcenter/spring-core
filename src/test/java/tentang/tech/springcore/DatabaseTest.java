package tentang.tech.springcore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
  @Test
  void testSingleton() {
    Database database = Database.getInstance();
    Database database1 = Database.getInstance();
    Assertions.assertSame(database,database1);
  }
}
