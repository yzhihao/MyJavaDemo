package com.webSocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.webSocket.handler.SystemWebSocketHandler;
import com.webSocket.interceptor.HandshakeInterceptor;

@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements
        WebSocketConfigurer {

    public WebSocketConfig() {
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(systemWebSocketHandler(), "/websck").addInterceptors(new HandshakeInterceptor());

        System.out.println("registed!");
        registry.addHandler(systemWebSocketHandler(), "/sockjs/websck/info").addInterceptors(new HandshakeInterceptor())
                .withSockJS();

    }

    @Bean
    public WebSocketHandler systemWebSocketHandler() {
        //return new InfoSocketEndPoint();
        return new SystemWebSocketHandler();
    }

}

/*@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
  @Override
  public void configureMessageBroker(MessageBrokerRegistry config) {
      config.enableSimpleBroker("/topic", "/queue");
      config.setApplicationDestinationPrefixes("/app");
      // 应用程序以 /app 为前缀，而 代理目的地以 /topic 为前缀.
      // js.url = "/spring13/app/hello" -> @MessageMapping("/hello") 注释的方法.
  }

  @Override
  public void registerStompEndpoints(StompEndpointRegistry registry) {
      registry.addEndpoint("/hello").withSockJS();
      // 在网页上我们就可以通过这个链接 /server/hello 来和服务器的WebSocket连接
  }
}
*/