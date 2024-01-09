import AbstractFabric.AbstractFabricService;
import Builder.BuilderService;
import Singleton.SingletonService;
import FactoryMethod.FactoryMethodService;

public class Main {
    public static void main(String[] args) {
        SingletonService service = new SingletonService();
        service.exec();

        FactoryMethodService service2 = new FactoryMethodService();
        service2.exec();

        AbstractFabricService service3 = new AbstractFabricService();
        service3.exec();

        BuilderService service4 = new BuilderService();
        service4.exec();
    }
}