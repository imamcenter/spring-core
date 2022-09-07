package tentang.tech.springcore.listener;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import tentang.tech.springcore.event.LoginSuccessEvent;

@Slf4j
@Component
public class UserListener {

  @EventListener(classes = LoginSuccessEvent.class)
  public void onLoginSuccessEvent(LoginSuccessEvent login) {
    log.info("success login again for user {}", login.getUser());
  }
}
