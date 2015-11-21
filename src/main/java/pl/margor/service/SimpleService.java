package pl.margor.service;

import org.springframework.stereotype.Component;

/*
 * @author margor
 */
@Component
public class SimpleService {
    
    public String generateSimpleText() {
        return "Managed by Spring container!";
    }
    
}
