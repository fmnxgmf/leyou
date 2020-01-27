package com.leyou.upload.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/31 17:27
 * @version:
 * @modified By:
 */
@ConfigurationProperties(prefix = "ly.upload")
@Data
public class UploadProperties {
    private String baseUrl;
    private List<String> allowTypes;
}
