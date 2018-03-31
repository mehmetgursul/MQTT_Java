package selfstudy.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Publisher {
	public static void main(String[] args) throws MqttException {

		if (args.length != 1) {
			System.out.println("Please write message!!!");
			return;
		}

		System.out.println("-------------");
		System.out.println("Publisher Started");

		MqttClient client = new MqttClient(MQTTCallBackImpl.BROKER_URL, MqttClient.generateClientId());
		client.connect();
		MqttMessage message = new MqttMessage();
		message.setPayload(args[0].getBytes());
		client.publish("topicTest", message);

		System.out.println("\tMessage '" + args[0] + "' to 'topicTest'");

		client.disconnect();

		System.out.println("Publisher Ended");

		System.out.println("-------------");

	}
}
