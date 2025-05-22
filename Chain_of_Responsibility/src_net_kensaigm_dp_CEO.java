package net.kensaigm.dp;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO's can authorize all requests.");
    }
}
