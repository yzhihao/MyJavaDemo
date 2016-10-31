package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.socket.TextMessage;

import com.webSocket.handler.SystemWebSocketHandler;

@Controller
public class SendMessageController {


 
    @Bean
    public SystemWebSocketHandler systemWebSocketHandler() {
        return new SystemWebSocketHandler();
    }


    @RequestMapping("/auditing")
    public String auditing(HttpServletRequest request){
    	System.out.println(" visit the conctroller");
        systemWebSocketHandler().sendMessageToUsers( new TextMessage("xwew"));
        return "NewFile";
    }
}