package com.gemalto.mq;



/*
@Configuration
public class Config {



    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory) {
        return new JmsTemplate(connectionFactory);
    }

    @Bean
    public ConnectionFactory mqConnectionFactory() {
        ConnectionFactory connectionFactory = new MQConnectionFactory();
        try {
            ((MQConnectionFactory) connectionFactory).setQueueManager("RENIECQM");
            ((MQConnectionFactory) connectionFactory).setTransportType(1);
            ((MQConnectionFactory) connectionFactory).setPort(1414);
            ((MQConnectionFactory) connectionFactory).setHostName("192.168.100.38");
            ((MQConnectionFactory) connectionFactory).setChannel("MIGRACIONES.RENIECQM");
            return connectionFactory;

        } catch (JMSException e) {
            e.printStackTrace();
        }
        return null;
    }

}
*/