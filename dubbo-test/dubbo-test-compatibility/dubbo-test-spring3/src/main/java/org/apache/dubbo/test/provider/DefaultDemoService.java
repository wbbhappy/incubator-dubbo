package org.apache.dubbo.test.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.DemoService;
/**
 * Default {@link DemoService} implementation
 * @since 2.5.8
 */
@Service(
        version = "2.5.8",
        application = "dubbo-annotation-provider",
        protocol = "dubbo",
        registry = "my-registry"
)
public class DefaultDemoService implements DemoService {
    public String sayHello(String name) {
        return "DefaultDemoService - sayHell() : " + name;
    }
}
