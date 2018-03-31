package selfstudy.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

public class Subscriber {
	
	public static void main(String[] args) throws MqttException {
		System.out.println("---------------");
		System.out.println("Subscriber started");

		MqttClient client = new MqttClient(MQTTCallBackImpl.BROKER_URL, MqttClient.generateClientId());
		client.setCallback(new MQTTCallBackImpl());
		client.connect();
		client.subscribe("topicTest");
	}
}
