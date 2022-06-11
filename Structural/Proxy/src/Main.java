import library.IVideoLibrary;
import library.VideoLibrary;
import proxy.VideoCacheProxy;

public class Main {

    public static void main(String[] args) {
        IVideoLibrary library = new VideoLibrary();
        IVideoLibrary proxy = new VideoCacheProxy();

        long libraryTime = test(library);
        long proxyTime = test(proxy);

        System.out.println("Time saved by caching proxy: " + (libraryTime - proxyTime) + "ms");
    }

    private static long test(IVideoLibrary library) {
        long startTime = System.currentTimeMillis();

        library.getPopularVideos();
        library.getVideo("1");
        library.getPopularVideos();
        library.getVideo("2");
        library.getVideo("3");
        library.getVideo("4");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
