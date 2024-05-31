package patterns.Decorator;

import patterns.Employee;

public class SMSNotifier extends DecoratorBaseNotifier{
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(Employee receiver) {
        super.send(receiver);
        System.out.println("This is for sms and we have our special logic for it");
    }
}
