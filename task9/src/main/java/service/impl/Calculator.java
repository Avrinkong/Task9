package service.impl;

import org.oasisopen.sca.annotation.Reference;
import service.*;

/**
 * @author kxp6223065
 */
public class Calculator implements CalculatorInterface {
    private addInterface add;
    private subtractInterface subtract;
    private multiplyInterface multiply;
    private divideInterface divide;

    public addInterface getAdd() {
        return add;
    }

    @Reference
    public void setAdd(addInterface add) {
        this.add = add;
    }

    public subtractInterface getSubtract() {
        return subtract;
    }

    @Reference
    public void setSubtract(subtractInterface subtract) {
        this.subtract = subtract;
    }

    public multiplyInterface getMultiply() {
        return multiply;
    }

    @Reference
    public void setMultiply(multiplyInterface multiply) {
        this.multiply = multiply;
    }

    public divideInterface getDivide() {
        return divide;
    }

    @Reference
    public void setDivide(divideInterface divide) {
        this.divide = divide;
    }


    public double add(double n1, double n2) {
        return n1+n2;
    }

    public double divide(double n1, double n2) {
        try {
            return n1 / n2;
        } catch (Exception e) {
            return 0;
        }
    }

    public double subtract(double n1, double n2) {
        return n1-n2;
    }

    public double multiply(double n1, double n2) {
        return n1*n2;
    }
}
