package patterns;

import patterns.Adapter.SalaryCalculatorAdapter;
import patterns.Adapter.SalaryCalculatorService;
import patterns.Builder.MilitaryServiceFormBuilder;
import patterns.Builder.Request;
import patterns.Builder.RequestDirector;
import patterns.Decorator.Notifier;
import patterns.Decorator.SMSNotifier;
import patterns.Factory.OfficialReportCreator;
import patterns.Factory.ReportCreator;
import patterns.Factory.UnofficialReportCreator;
import patterns.Prototype.Laptop;
import patterns.Singleton.Admin;
import patterns.Singleton.CEO;
import patterns.Strategy.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    private static void hrSetFrontSalary() {
        Employee employee = new Employee("mohammad", Team.TECH, "111111");
        // Admin admin = new Admin("alireza", "0000Q1291");
        Admin admin = Admin.getInstance();
        admin.setSalary(employee, 34);
    }

    private static void hrSetBackSalary() {
        Employee employee = new Employee("asghar", Team.TECH, "122222");
        // Admin admin = new Admin("alireza", "000Q1291");
        Admin admin = Admin.getInstance();
        admin.setSalary(employee, 36);
    }

    private static void reflection() {
        try {
            Constructor<Admin> constructor = Admin.class.getDeclaredConstructor(String.class, String.class);
            constructor.setAccessible(true);
            Admin newAdmin = (Admin) constructor.newInstance("hashem", "00001q1290");
            Admin oldAdmin = Admin.getInstance();
            System.out.println(newAdmin.hashCode());
            System.out.println(oldAdmin.hashCode());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static void ceoSetter() {
        CEO ceo = CEO.INSTANCE;
        ceo.setSign("ali");
        ceo.setAddress("Tehran, Saadat abad, alley 1");
        ceo.setIdentificationCode("03700097392");
    }

    private static void ceoUser() {
        System.out.println(CEO.INSTANCE.getAddress());
    }

    private static void usePrototype() {
        Laptop laptop1 = null;
        try {
            laptop1 = new Laptop("1111111111", new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2024"), "1111112222", "AAAA", 2048, 4080, 1080, 1080, "DDR4", "INTEL", "HARD");
            Laptop laptop2 = (Laptop) laptop1.clone();
            laptop2.setId("1122222");
            laptop2.setCompanyID("23424242");
            laptop2.setSupportCode("BBB");
            System.out.println(laptop1.hashCode());
            System.out.println(laptop2.hashCode());
        } catch (ParseException | CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void notifyProblem() {
        boolean isOfficial = true;
        ReportCreator creator = null;
        if (isOfficial) {
            creator = new OfficialReportCreator();
        } else {
            creator = new UnofficialReportCreator();
        }
        creator.notifyReport("1111", "tv is broken!!");
    }

    private static void showSalaryByAdapter(Employee employee) {
        SalaryCalculatorAdapter adapter = new SalaryCalculatorAdapter(new SalaryCalculatorService());
        System.out.println(adapter.showSalary(employee));
    }

    private static void extendClassByDecorator(Employee employee) {
        Notifier notifier = new Notifier();
        notifier.send(employee);

        // after some years we need to extend it and send sms
        notifier = new SMSNotifier(notifier);
        notifier.send(employee);
    }
    public static void main(String[] args) {
        // Singleton
        hrSetFrontSalary();
        hrSetBackSalary();

        // reflection
        reflection();

        // Singleton by enum
        ceoSetter();
        ceoUser();

        // prototype
        usePrototype();

        // factory method
        notifyProblem();

        // builder on employee's forms
        MilitaryServiceFormBuilder militaryBuilder = new MilitaryServiceFormBuilder();
        RequestDirector director = new RequestDirector(militaryBuilder);
        Employee employee = new Employee("ali", Team.TECH, "00000q123");
        Request request = director.make(employee, "bad!!!!!", "2d");

        // adapter
        showSalaryByAdapter(employee);

        // decorator
        extendClassByDecorator(employee);

        // facade
        // see facade folder

        // strategy
        String employeesType = "junior";
        PaymentStrategy strategy = null;
        if (employeesType.equals("junior")) {
            strategy = new JuniorPaymentStrategy();
        } else if (employeesType.equals("senior")) {
            strategy = new SeniorPaymentStrategy();
        } else {
            strategy = new CLevelPaymentStrategy();
        }
        PaymentAdmin admin = new PaymentAdmin(strategy);
        admin.pay();
    }
}
