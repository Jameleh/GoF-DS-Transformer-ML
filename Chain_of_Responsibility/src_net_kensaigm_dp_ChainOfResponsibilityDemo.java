package net.kensaigm.dp;

import java.nio.file.DirectoryIteratorException;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Director todd = new Director();
        VP terry = new VP();
        CEO scott = new CEO();

        todd.setSuccessor(terry);
        terry.setSuccessor(scott);

        Request request = new Request(RequestType.CONFERENCE, 500);
        todd.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        todd.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        todd.handleRequest(request);

    }
}
