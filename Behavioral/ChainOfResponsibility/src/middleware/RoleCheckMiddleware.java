package middleware;

public class RoleCheckMiddleware extends Middleware {
    private final String ADMIN_EMAIL = "admin@example.com";

    @Override
    public boolean checkUserData(String email, String password) {
        if (email.equals(ADMIN_EMAIL)) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNextMiddlewareExist(email, password);
    }
}