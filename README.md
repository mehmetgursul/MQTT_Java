# MQTT (Message Queue Telemetry Transport) is a publish/subscribe based lightweight messaging protocol.

To run the application
1. Run the MQTT Broker (I have mosquitto mqtt broker)
2. mvn exec:java  -Dexec.mainClass=selfstudy.mqtt.Subscriber
3. mvn exec:java  -Dexec.mainClass=selfstudy.mqtt.Publisher -Dexec.args="Message"

In this study, I used following resources:
1. https://www.javacodegeeks.com/2017/01/getting-started-mqtt-java.html
2. https://gist.github.com/m2mIO-gister/5275324


