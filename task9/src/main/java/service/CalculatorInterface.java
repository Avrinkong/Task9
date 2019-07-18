package service;

import org.oasisopen.sca.annotation.Remotable;

/**
 * @author kxp6223065
 */
@Remotable
public interface CalculatorInterface {
    double add(double n1, double n2);
    double divide(double n1, double n2);
    double subtract(double n1, double n2);
    double multiply(double n1, double n2);
}
