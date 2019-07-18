package service.impl;

import org.springframework.stereotype.Service;
import service.addInterface;

@Service
public class add implements addInterface {
    public double add(double n1, double n2) {
        return n1+n2;
    }
}
