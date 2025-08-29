package com.example.autosolver.config;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;


@Validated
@ConfigurationProperties(prefix = "app")
public class AppProperties {
@NotBlank private String baseUrl;
@NotBlank private String name;
@NotBlank private String regNo;
@Email @NotBlank private String email;
@NotBlank private String language;


public String getBaseUrl() { return baseUrl; }
public void setBaseUrl(String baseUrl) { this.baseUrl = baseUrl; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getRegNo() { return regNo; }
public void setRegNo(String regNo) { this.regNo = regNo; }
public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }
public String getLanguage() { return language; }
public void setLanguage(String language) { this.language = language; }
}
