package com.fw.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Component
@Service//将服务发布出去
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "复仇者联盟";
    }
}
