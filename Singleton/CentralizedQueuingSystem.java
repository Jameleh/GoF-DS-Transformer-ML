public class CentralizedQueuingSystem {

    private static CentralizedQueuingSystem instance;
    private int currentQueueNumber;
    private int queueLimit; 

    private CentralizedQueuingSystem() { 
        currentQueueNumber = 1;
        queueLimit = 10;
    }

    public static synchronized CentralizedQueuingSystem getInstance() {
        if (instance == null) {
            instance = new CentralizedQueuingSystem();
        }
        return instance;
    }

    public synchronized int generateQueueNumber(int stationId) {
        if (currentQueueNumber > queueLimit) {
            resetQueueNumber(1); 
        }
        return currentQueueNumber++; 
    }

    public synchronized void resetQueueNumber(int newNumber) {
        if (newNumber >= 1) {
            currentQueueNumber = newNumber; 
        }
    }
}