package org.mediator.project.client;

import lombok.Getter;
import lombok.SneakyThrows;
import org.mediator.project.mediator.ChatMediator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Date;

public class Client {

    private final DataInputStream input;
    private final DataOutputStream output;
    private final ChatMediator mediator;

    private final Socket socket;
    @Getter
    private String username;

    @SneakyThrows
    public Client(Socket clientSocket, ChatMediator mediator) {
        this.input = new DataInputStream(clientSocket.getInputStream());
        this.output = new DataOutputStream(clientSocket.getOutputStream());
        this.socket = clientSocket;
        this.mediator = mediator;
    }

    @SneakyThrows
    public void login() {
        this.username = input.readUTF();
        new ClientListener(input, this).start();
    }

    public void send(String message) {
        mediator.sendMessage(this, message);
    }

    @SneakyThrows
    public void receive(String sender, String message) {
        sender = sender.equals(username) ? "me" : sender;
        output.writeUTF(new Date() + "|" + sender + ": " + message);
    }

    @SneakyThrows
    public void logout() {
        mediator.removeClient(this);
        if (!socket.isOutputShutdown())
            socket.shutdownOutput();
        if (!socket.isClosed())
            socket.close();
    }

    @Override
    public String toString() {
        return getUsername();
    }

    @Override
    public int hashCode() {
        return getUsername().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Client))
            return false;

        return getUsername().equals(((Client) obj).getUsername());
    }
}
