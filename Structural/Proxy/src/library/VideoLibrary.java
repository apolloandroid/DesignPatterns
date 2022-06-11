package library;


import server.Server;

import java.util.HashMap;

public class VideoLibrary implements IVideoLibrary {

    private String URL = "http://www.youtube.com";
    private Server server = new Server(URL);

    @Override
    public HashMap<String, Video> getPopularVideos() {
        server.connect();
        return server.getPopularVideos();
    }

    @Override
    public Video getVideo(String id) {
        server.connect();
        return server.getVideo(id);
    }
}
