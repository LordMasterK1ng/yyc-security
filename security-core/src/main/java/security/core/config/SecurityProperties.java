package security.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/16
 */
@ConfigurationProperties(prefix = "yyc.security")
public class SecurityProperties {

    private BrowserProperties browserProperties;

    public BrowserProperties getBrowserProperties() {
        return browserProperties;
    }

    public void setBrowserProperties(BrowserProperties browserProperties) {
        this.browserProperties = browserProperties;
    }
}
