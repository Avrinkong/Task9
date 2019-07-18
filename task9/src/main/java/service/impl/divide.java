package service.impl;

import org.springframework.stereotype.Service;
import service.divideInterface;

@Service
public class divide implements divideInterface {

    public double divide(double n1, double n2) {
        return n1/n2;
    }
}
