package middleware;

import server.Server;

/*
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 * */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("Email " + email + " is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password for email: " + email);
            return false;
        }
        return checkNext(email, password);
    }

}
