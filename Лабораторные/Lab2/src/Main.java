import Adapter.AdapterService;
import Bridge.BridgeService;
public class Main {
    public static void main(String[] args) {
        AdapterService adapterService = new AdapterService();
        adapterService.exec();

        BridgeService bridgeService = new BridgeService();
        bridgeService.exec("Radio");
    }
}