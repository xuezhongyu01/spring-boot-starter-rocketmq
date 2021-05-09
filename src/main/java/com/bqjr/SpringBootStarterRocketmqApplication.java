package com.bqjr;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStarterRocketmqApplication {

	public static void main(String[] args) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
		ApplicationContext context = SpringApplication.run(SpringBootStarterRocketmqApplication.class, args);
		DefaultMQProducer defaultMQProducer = context.getBean(DefaultMQProducer.class);
		Message msg = new Message("TEST",// topic
				"TEST",// tag
				"KKK",//key用于标识业务的唯一性
				("Hello RocketMQ !!!!!!!!!!" ).getBytes()// body 二进制字节数组
		);
		SendResult result = defaultMQProducer.send(msg);
		System.out.println(result);
		DefaultMQPushConsumer consumer = context.getBean(DefaultMQPushConsumer.class);
	}
}
