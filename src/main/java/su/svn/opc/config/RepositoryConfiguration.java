package su.svn.opc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import su.svn.opc.handlers.UserNameHandler;

@Configuration
public class RepositoryConfiguration {

    @Bean
    UserNameHandler userNameHandler() {
        return new UserNameHandler();
    }
}
