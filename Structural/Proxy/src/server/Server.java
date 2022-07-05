package server;

import library.Video;

import java.util.HashMap;

public class Server {
    private String url;

    public Server(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("Connecting to " + url + "...");
        simulateNetWorkLatency();
        System.out.println("Connected!");
    }

    public HashMap<String, Video> getPopularVideos() {
        System.out.println("Downloading popular videos");
        simulateNetWorkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("1", new Video("1", "Catzzzz.avi"));
        hmap.put("2", new Video("2", "Dog play with ball.mp4"));
        hmap.put("3", new Video("3", "Dancing video.mpq"));
        hmap.put("4", new Video("4", "Barcelona vs RealM.mov"));
        hmap.put("5", new Video("5", "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    public Video getVideo(String id) {
        System.out.print("Downloading video id = " + id + " ... ");
        simulateNetWorkLatency();
        Video video = new Video(id, "library.Video title");
        System.out.print("Done!" + "\n");
        return video;
    }

    private void simulateNetWorkLatency() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
