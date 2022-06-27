package middleware;

import server.Server;

public class UserExistMiddleware extends Middleware {
    private Server server;

    public UserExistMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean checkUserData(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValid(email, password)) {
            System.out.println("Wrong password");
            return false;
        }
        return checkNextMiddlewareExist(email, password);
    }
}