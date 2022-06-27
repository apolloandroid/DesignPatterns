package middleware;

public class ThrottlingMiddleware extends Middleware {

    private final long MINUTE_IN_MILLIS = 60_000L;
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean checkUserData(String email, String password) {
        if (System.currentTimeMillis() > currentTime + MINUTE_IN_MILLIS) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;
        if (request > requestPerMinute) {
            System.out.println("Request limit exceed!");
        }
        return checkNextMiddlewareExist(email, password);
    }
}