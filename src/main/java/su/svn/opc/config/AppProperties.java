package su.svn.opc.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Slf4j
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private Properties jdbcTemplate;

    public Properties getJdbcTemplate() {
        log.trace("getJdbcTemplate() -> {}", jdbcTemplate);
        return jdbcTemplate;
    }

    public void setJdbcTemplate(Properties jdbcTemplate) {
        log.trace("setJdbcTemplate({})", jdbcTemplate);
        this.jdbcTemplate = jdbcTemplate;
    }
}
