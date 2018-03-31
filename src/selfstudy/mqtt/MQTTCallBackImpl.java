package selfstudy.mqtt;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MQTTCallBackImpl implements MqttCallback{
	
	static final String BROKER_URL = "tcp://localhost:1883";

	@Override
	public void connectionLost(Throwable cause) {	
		System.out.println("Connection to MQTT broker lost!!!");
	}

	@Override
	public void messageArrived(String topic, MqttMessage message) throws Exception {	
		System.out.println("-------------------------------------------------");
		System.out.println("| Topic:" + topic);
		System.out.println("| Message received: " + new String(message.getPayload()));
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) {
		try {
			System.out.println("Pub complete" + new String(token.getMessage().getPayload()));
		} catch (MqttException e) {
			e.printStackTrace();
		}
	}

}
