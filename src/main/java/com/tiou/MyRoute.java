package com.tiou;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by ronaldo on 06/02/2017.
 */
@Component
public class MyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:foo")
                .to("log:bar");
    }
}
