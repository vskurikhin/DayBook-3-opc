package su.svn.opc.config;

import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Properties;

@Slf4j
@Configuration
public class OracleConfiguration {

    public static final String ORACLE_NET_WALLET_LOCATION = "oracle.net.wallet_location";
    public static final String URL = "url";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final String FETCH_SIZE = "fetch-size";

    private final int fetchSize;
    private final Properties datasourceProperties;

    public OracleConfiguration(AppProperties appProperties, SpringProperties properties) {
        String fetchSize = appProperties.getJdbcTemplate().getProperty(FETCH_SIZE);
        this.fetchSize = Integer.parseInt(fetchSize);
        datasourceProperties = properties.getDatasource();
    }

    @Bean
    @Primary
    public DataSource dataSource() {
        OracleDataSource dataSource = null;
        try {
            dataSource = new OracleDataSource();
            Properties props = new Properties();
            props.put(ORACLE_NET_WALLET_LOCATION, oracleNetWalletLocation());
            dataSource.setConnectionProperties(props);
            dataSource.setURL(datasourceProperties.getProperty(URL));
            dataSource.setUser(datasourceProperties.getProperty(USERNAME));
            dataSource.setPassword(datasourceProperties.getProperty(PASSWORD));
        } catch (Exception e) {
            log.error("dataSource ", e);
        }
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource, SpringProperties properties) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setFetchSize(fetchSize);
        return jdbcTemplate;
    }

    private String oracleNetWalletLocation() {
        return "(source=(method=file)(method_data=(directory=" +
                System.getProperty(ORACLE_NET_WALLET_LOCATION) +
                ")))";
    }
}
