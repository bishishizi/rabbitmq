package com.demo.rabbitmq.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wwchang
 * @date 2017/12/6 17:59
 **/
@Configuration
public class RabbitmqConfig {
	/**
	 * 创建一个队列
	 */
	@Bean
	public Queue helloQueue(){
		return new Queue("hello");
	}
}
