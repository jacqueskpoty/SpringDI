package mySpringPractice.SpringDI.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConstructorBinding
@ConfigurationProperties("guru")
public class ConstructorBiding {

    private final String user;
    private final String password;
    private final String dburl;


    public ConstructorBiding(String user, String password, String dburl) {
        this.user = user;
        this.password = password;
        this.dburl = dburl;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDburl() {
        return dburl;
    }
}
