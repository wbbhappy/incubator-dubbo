package org.apache.dubbo.test.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.demo.DemoService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
/**
 * Consumer {@Link Configuration}
 * @since 2.5.8
 */
@Configuration
@ImportResource("META-INF/spring/dubbo-consumer.xml")
@DubboComponentScan
public class ConsumerConfiguration {
    @Reference(version = "2.5.8", url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    public DemoService getDemoService() {
        return demoService;
    }
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
}
