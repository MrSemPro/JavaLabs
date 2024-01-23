import ChainHandler.ChainService;
import ChainHandler.Request;
import Iterator.ItemType;
import Iterator.TreasureChest;
import Iterator.TreasureChestItemIterator;
import Strategy.StrategyServiceImpl;
import Strategy.CommaSeparatedStrategy;
import Strategy.SemicolonSeparatedStrategy;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("this");
        list.add("is");
        list.add("laba");
        list.add("number");
        list.add("three");
        StrategyServiceImpl service = new StrategyServiceImpl(new CommaSeparatedStrategy());
        System.out.println(service.exec(list));

        service = new StrategyServiceImpl(new SemicolonSeparatedStrategy());
        System.out.println(service.exec(list));


        String string = "method:GET \npath: path_path_path \nsession: session_session";
        ChainService service1 = new ChainService();
        Request request = service1.exec(string);

        System.out.println("Method: " + request.getMethod());
        System.out.println("Path: " + request.getPath());
        System.out.println("Session: " + request.getSession());

        TreasureChest chest = new TreasureChest () ;
        TreasureChestItemIterator chestIterator = new TreasureChestItemIterator (chest, ItemType.WEAPON ) ;
        while ( chestIterator . hasNext () ) {
            System.out.println ( chestIterator . next () ) ;
        }


    }
}