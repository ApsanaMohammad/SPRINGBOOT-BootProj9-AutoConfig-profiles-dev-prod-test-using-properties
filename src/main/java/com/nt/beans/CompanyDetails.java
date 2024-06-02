package com.nt.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Component("company")
@ConfigurationProperties(prefix = "company")
public class CompanyDetails {
    private String name;
    private String type;
    private String location;
    private List<String> members;
    private Map<String, String> phoneNumbers;
}
