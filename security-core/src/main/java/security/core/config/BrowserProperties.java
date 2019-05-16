package security.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/16
 */

public class BrowserProperties {

    private String defaultReturnUrl;

    public BrowserProperties() {
    }

    public String getDefaultReturnUrl() {
        return defaultReturnUrl;
    }

    public void setDefaultReturnUrl(String defaultReturnUrl) {
        this.defaultReturnUrl = defaultReturnUrl;
    }
}
