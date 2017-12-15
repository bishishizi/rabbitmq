package com.demo.rabbitmq.componet;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wwchang
 * @date 2017/12/6 17:53
 **/
@Component
public class Sender {

	@Autowired
	private AmqpTemplate amqpTemplate;

	/**
	 * 生产者
	 */
	public  void send(){
		String context = "Hello" + new Date();
		System.out.println(" Sender : " + context);
		this.amqpTemplate.convertAndSend("hello",context);
	}
}
