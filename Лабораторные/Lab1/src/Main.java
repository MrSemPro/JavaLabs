import Singleton.Singleton;
import FactoryMethod.FactoryMethod;
import AbstractFabric.AbstractFabric;
import Builder.Builder;

public class Main {
    public static void main(String[] args) {
        Singleton service = new Singleton();
        service.exec();

        FactoryMethod service2 = new FactoryMethod();
        service2.exec();

        AbstractFabric service3 = new AbstractFabric();
        service3.exec();

        Builder service4 = new Builder();
        service4.exec();

    }
}