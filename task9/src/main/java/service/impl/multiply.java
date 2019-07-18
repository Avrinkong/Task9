package service.impl;

import org.springframework.stereotype.Service;
import service.multiplyInterface;

@Service
public class multiply implements multiplyInterface {
    public double multiply(double n1, double n2) {
        return n1*n2;
    }
}
