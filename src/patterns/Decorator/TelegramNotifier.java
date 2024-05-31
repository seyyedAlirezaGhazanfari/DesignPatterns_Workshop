package patterns.Decorator;

import patterns.Employee;

public class TelegramNotifier extends DecoratorBaseNotifier{
    public TelegramNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(Employee receiver) {
        super.send(receiver);
        System.out.println("notify all members by telegram simultaneously for example.");
    }
}
