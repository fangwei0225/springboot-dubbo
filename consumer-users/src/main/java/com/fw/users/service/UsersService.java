package com.fw.users.service;

import com.alibaba.dubbo.config.annotation.Reference;

import com.fw.ticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
    //远程引用
    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了,可以去看"+ticket+"了！");
    }
}
