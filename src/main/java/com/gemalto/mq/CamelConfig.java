package com.gemalto.mq;

/*import com.ibm.mq.jms.MQConnectionFactory;
import com.ibm.msg.client.wmq.WMQConstants;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.UserCredentialsConnectionFactoryAdapter;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

@Configuration
public class CamelConfig {

    @Autowired
    CamelContext camelContext;

    @Bean
    CamelContextConfiguration contextConfiguration() {
        return new CamelContextConfiguration() {
            @Override
            public void beforeApplicationStart(CamelContext context) {

                ConnectionFactory connectionFactory = new MQConnectionFactory();
                try {
                    ((MQConnectionFactory) connectionFactory).setQueueManager("QUEUE.MANAGER");
                    ((MQConnectionFactory) connectionFactory).setTransportType(1);
                    ((MQConnectionFactory) connectionFactory).setPort(1414);
                    ((MQConnectionFactory) connectionFactory).setHostName("10.114.105.32");
                    ((MQConnectionFactory) connectionFactory).setChannel("SERVER.CHANNEL");

                } catch (JMSException e) {
                    e.printStackTrace();
                }

                UserCredentialsConnectionFactoryAdapter connectionFactoryAdapter=new UserCredentialsConnectionFactoryAdapter();
                connectionFactoryAdapter.setTargetConnectionFactory(connectionFactory);
                //connectionFactoryAdapter.setUsername("MUSR_MQADMIN");
                //connectionFactoryAdapter.setPassword("");

                context.addComponent("wmq", JmsComponent.jmsComponentAutoAcknowledge(connectionFactoryAdapter));

                System.setProperty("hawtio.authenticationEnabled", "false");
            }

            @Override
            public void afterApplicationStart(CamelContext camelContext) {
                // Do nothing
            }
        };
    }
}*/
