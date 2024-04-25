import org.junit.jupiter.api.Test;
import zamestitel.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ProxyTest {
    @Test

    void testproxy(){
        YouTubeVideoDownloader nativeD = new YouTubeVideoDownloader(new ThirdPartyYouTubeApiClient());
        YouTubeVideoDownloader smartD = new YouTubeVideoDownloader(new CacheProxyYouTubeApiClient());
        assertSame(nativeD.getClass(), Zamestitel.nativeDownloader.getClass());
        assertSame(smartD.getClass(), Zamestitel.smartDownloader.getClass());
    }
}