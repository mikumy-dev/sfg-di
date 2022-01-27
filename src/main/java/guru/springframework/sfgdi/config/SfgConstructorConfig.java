package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("guru.constructor.config")
@ConstructorBinding
public class SfgConstructorConfig {
    // set to final to prevent the properties values from being changed after the initialization
    private final String username;
    private final String password;
    private final String jdbc_url;

    public SfgConstructorConfig(String username, String password, String jdbc_url) {
        this.username = username;
        this.password = password;
        this.jdbc_url = jdbc_url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbc_url() {
        return jdbc_url;
    }

    @Override
    public String toString() {
        return "SfgConstructorConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jdbc_url='" + jdbc_url + '\'' +
                '}';
    }
}
