package doman;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;
import service.CalculatorInterface;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorServerClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException , IOException {
        Node node= NodeFactory.newInstance().createNode("Calculator.composite");
        node.start();
        System.out.println("service启动");
        /*add c = (add) Naming.lookup("//127.0.0.1:9999/CalculatorRMI");
        System.out.println(c.add(2, 2));*/
        CalculatorInterface c = node.getService(CalculatorInterface.class,"CalculatorServiceComponent");
        System.out.println("3 + 2 = " + c.add(3, 2));
        System.out.println("3 - 2 = " + c.subtract(3, 2));
        System.out.println("3 * 2 = " + c.multiply(3, 2));
        System.out.println("3 / 2 = " + c.divide(3, 2));
        node.stop();
    }
}
