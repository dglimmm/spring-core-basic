package hello.core.scan.filter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @Test
    void filterScan(){
        new AnnotationConfigApplicationContext()
    }

    static class ComponentfilterAppConfig{
    }
}
