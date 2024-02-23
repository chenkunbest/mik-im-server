package com.mikgeek.common.elasticsearch.config;

import cn.easyes.starter.register.EsMapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

/**
 * easy-es 配置
 *
 * @author chenkunbest
 */
@AutoConfiguration
@ConditionalOnProperty(value = "easy-es.enable", havingValue = "true")
@EsMapperScan("com.mikgeek.**.esmapper")
public class EasyEsConfiguration {

}