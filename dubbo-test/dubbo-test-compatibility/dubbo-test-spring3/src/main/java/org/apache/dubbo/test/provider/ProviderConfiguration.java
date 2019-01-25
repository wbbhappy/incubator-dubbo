package org.apache.dubbo.test.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
/**
 * Provider {@Link Configuration}
 * @since 2.5.8
 */
@Configuration
@ImportResource("META-INF/spring/dubbo-provider.xml")
@DubboComponentScan
public class ProviderConfiguration {
}
