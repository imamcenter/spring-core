package tentang.tech.springcore.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;
import tentang.tech.springcore.data.User;

@Component
public class LoginSuccessEvent extends ApplicationEvent {

  @Getter
  private User user;


  public LoginSuccessEvent(User user) {
    super(user);
    this.user = user;
  }
}

