package com.github.underbell.properties.event;

import com.github.underbell.properties.properties.ApplicationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PropertiesReadyEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final ApplicationProperties applicationProperties;

    public PropertiesReadyEvent(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("application.mode = {}", applicationProperties.getMode());
        log.info("application.phase = {}", applicationProperties.getPhase());
        log.info("application.port = {}", applicationProperties.getPort());
        log.info("application.secret.mysql = {}", applicationProperties.getSecret().getMysql());
        log.info("application.secret.redis = {}", applicationProperties.getSecret().getRedis());
    }
}
