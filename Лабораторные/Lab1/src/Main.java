import Singleton.Singleton;
import FactoryMethod.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Singleton service = new Singleton();
        service.exec();

        FactoryMethod service2 = new FactoryMethod();
        service2.exec();

    }
}