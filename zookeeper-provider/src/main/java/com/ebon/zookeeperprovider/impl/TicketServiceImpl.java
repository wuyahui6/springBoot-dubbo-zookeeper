package com.ebon.zookeeperprovider.impl;

import com.ebon.zookeeperapi.service.TicketService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "<<西游记>>";
    }
}
