package middleware;

public abstract class Middleware {
    private Middleware nextMiddleware;

    public Middleware linkWith(Middleware next) {
        this.nextMiddleware = next;
        return next;
    }

    public abstract boolean checkUserData(String email, String password);

    protected boolean checkNextMiddlewareExist(String email, String password) {
        if (nextMiddleware == null) return true;
        return nextMiddleware.checkUserData(email, password);
    }
}
