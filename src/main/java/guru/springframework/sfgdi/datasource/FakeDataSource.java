package guru.springframework.sfgdi.datasource;

public class FakeDataSource {

    private String username;
    private String password;
    private String jdbcUrl;

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", jdbcUrl='" + jdbcUrl + '\'' +
                '}';
    }

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

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
