package com.demo.rabbitmq.componet;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author wwchang
 * @date 2017/12/6 17:57
 **/
@Component
@RabbitListener(queues = "hello")
public class Receiver {

	/**
	 * 消费者
	 * @param hello
	 */
	@RabbitHandler
	public void process(String hello){
		System.out.println(" Receiver : " + hello);
	}
}
