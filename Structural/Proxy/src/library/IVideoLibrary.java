package library;

import java.util.HashMap;

public interface IVideoLibrary {
    HashMap<String, Video> getPopularVideos();

    Video getVideo(String id);
}
