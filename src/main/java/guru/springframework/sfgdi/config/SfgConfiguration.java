package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("guru.property.config")
@Configuration
public class SfgConfiguration {
    private String username;
    private String password;
    private String jdbc_url;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbc_url() {
        return jdbc_url;
    }

    public void setJdbc_url(String jdbc_url) {
        this.jdbc_url = jdbc_url;
    }

    @Override
    public String toString() {
        return "SfgConfiguration{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jdbc_url='" + jdbc_url + '\'' +
                '}';
    }
}
