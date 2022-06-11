package proxy;

import library.IVideoLibrary;
import library.Video;
import library.VideoLibrary;

import java.util.HashMap;

public class VideoCacheProxy implements IVideoLibrary {

    private IVideoLibrary videoLibrary;
    private HashMap<String, Video> cachePopular = new HashMap();

    public VideoCacheProxy() {
        this.videoLibrary = new VideoLibrary();
    }

    @Override
    public HashMap<String, Video> getPopularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = videoLibrary.getPopularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String id) {
        Video video = cachePopular.get(id);
        if (video == null) {
            video = videoLibrary.getVideo(id);
            cachePopular.put(id, video);
        } else {
            System.out.println("Retrieved video '" + id + "' from cache.");
        }
        return video;
    }
}
