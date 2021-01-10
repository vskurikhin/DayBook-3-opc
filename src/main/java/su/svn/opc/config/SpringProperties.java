package su.svn.opc.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Slf4j
@Component
@ConfigurationProperties(prefix = "spring")
public class SpringProperties {

    private Properties datasource;

    public Properties getDatasource() {
        log.trace("getDatasource() -> {}", datasource);
        return datasource;
    }

    public void setDatasource(Properties datasource) {
        log.trace("setDatasource({})", datasource);
        this.datasource = datasource;
    }
}
