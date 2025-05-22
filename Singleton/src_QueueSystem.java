
public class QueueSystem {
    private static QueueSystem instance;
    private int currentQueueNumber;

    private QueueSystem() {
        currentQueueNumber = 1;
    }
    public static synchronized QueueSystem getInstance() {
        if (instance == null)
            instance = new QueueSystem();
        return instance;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public synchronized int generateNextQueueNumber() {
        return currentQueueNumber++;
    }

    public synchronized void resetQueueNumber(int newQueueNumber) {
        if (newQueueNumber >= 1) {
            currentQueueNumber = newQueueNumber;
            System.out.println("Queue number reset to: " + newQueueNumber);
        } else {
            System.out.println("Invalid queue number input.");
        }
    }
}
