package patterns.Decorator;

import patterns.Employee;

public class Notifier {
    public void send(Employee receiver) {
        System.out.println("sent to " + receiver.getName());
    }
}
