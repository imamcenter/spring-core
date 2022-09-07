package tentang.tech.springcore.data;

import lombok.Getter;
import tentang.tech.springcore.aware.IdAware;

public class Car implements IdAware {

  @Getter
  private String id;

  @Override
  public void setId(String id) {
    this.id = id;
  }


}
