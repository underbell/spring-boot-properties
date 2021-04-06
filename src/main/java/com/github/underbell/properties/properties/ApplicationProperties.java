package com.github.underbell.properties.properties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@ConstructorBinding
@ConfigurationProperties("application")
@Validated
@RequiredArgsConstructor
public class ApplicationProperties {
  @NotBlank private final String mode;
  @NotBlank private final String phase;
  @NotBlank private final String port;
  @NotNull private final Secret secret;

  @Getter
  @RequiredArgsConstructor
  public static final class Secret  {
    @NotBlank private final String mysql;
    @NotBlank private final String redis;
  }
}
