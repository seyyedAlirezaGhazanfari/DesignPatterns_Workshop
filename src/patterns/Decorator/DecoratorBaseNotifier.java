package patterns.Decorator;

import patterns.Employee;

public class DecoratorBaseNotifier extends Notifier{
    private Notifier notifier;

    public DecoratorBaseNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(Employee receiver) {
        this.notifier.send(receiver);
    }
}
