package com.hitech.skeleton.framework.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * WebSocket 配置文件
 *
 * @author Steven
 * @date 2019-05-04
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		System.out.println("====================================");
		System.out.println("registerWebSocketHandlers");
		System.out.println("====================================");
		registry.addHandler(new MarcoHandler(), "/marco");
	}

	@Bean
	public MarcoHandler marcoHandler() {
		return new MarcoHandler();
	}

}
