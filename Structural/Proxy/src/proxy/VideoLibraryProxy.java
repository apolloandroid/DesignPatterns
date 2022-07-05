package proxy;

import library.IVideoLibrary;
import library.Video;
import library.VideoLibrary;

import java.util.HashMap;

public class VideoLibraryProxy implements IVideoLibrary {

    private IVideoLibrary videoLibrary;
    private HashMap<String, Video> cache = new HashMap();

    public VideoLibraryProxy() {
        this.videoLibrary = new VideoLibrary();
    }

    @Override
    public HashMap<String, Video> getPopularVideos() {
        if (cache.isEmpty()) {
            cache = videoLibrary.getPopularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cache;
    }

    @Override
    public Video getVideo(String id) {
        Video video = cache.get(id);
        if (video == null) {
            video = videoLibrary.getVideo(id);
            cache.put(id, video);
        } else {
            System.out.println("Retrieved video '" + id + "' from cache.");
        }
        return video;
    }
}
