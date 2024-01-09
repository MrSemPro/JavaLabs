import Adapter.AdapterService;
import Bridge.BridgeService;
import Proxy.ProxyService;

public class Main {
    public static void main(String[] args) {
        AdapterService adapterService = new AdapterService();
        adapterService.exec();

        BridgeService bridgeService = new BridgeService();
        bridgeService.exec("Radio");

        ProxyService proxyService = new ProxyService();
        proxyService.exec();
    }
}