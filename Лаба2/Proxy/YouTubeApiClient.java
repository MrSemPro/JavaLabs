package Proxy;
import java.util.*;

public interface YouTubeApiClient {
    Map<String, Video> popularVideos();
    Video getVideo(String videoId);
}
