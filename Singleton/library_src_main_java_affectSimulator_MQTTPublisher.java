package affectSimulator;

import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MQTTPublisher implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(MQTTPublisher.class);
    private static final String BROKER_URL = "tcp://test.mosquitto.org:1883";
    private static final String CLIENT_ID = "ProjectPublisher";
    private static final String TOPIC = "project/topic";
    private static MQTTPublisher instance;
    private MqttClient client;
    private final MQTTCommunicatorInterface publisherInterface;

    private MQTTPublisher(MQTTCommunicatorInterface publisherInterface) {
        this.publisherInterface = publisherInterface;
        try {
            client = new MqttClient(BROKER_URL, CLIENT_ID, new MemoryPersistence());
            MqttConnectOptions options = new MqttConnectOptions();
            options.setAutomaticReconnect(true);
            options.setCleanSession(true);
            client.connect(options);
            logger.info("Connected to MQTT Broker at {}.", BROKER_URL);
        } catch (MqttException e) {
            logger.error("Failed to connect to MQTT Broker", e);
        }
    }

    public static synchronized MQTTPublisher getInstance(MQTTCommunicatorInterface publisherInterface) {
        if (instance == null) {
            instance = new MQTTPublisher(publisherInterface);
        }
        return instance;
    }

    public void publish(String message) {
        if (!publisherInterface.isRunning()) {
            return;
        }

        try {
            MqttMessage mqttMessage = new MqttMessage(message.getBytes());
            mqttMessage.setQos(2);
            client.publish(TOPIC, mqttMessage);
            logger.debug("Message published to topic {}: {}", TOPIC, message);
        } catch (MqttException e) {
            logger.error("Failed to publish message", e);
        }
    }

    @Override
    public void run() {
        while (publisherInterface.isRunning()) {
            publish("Periodic message from MQTTPublisher");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
