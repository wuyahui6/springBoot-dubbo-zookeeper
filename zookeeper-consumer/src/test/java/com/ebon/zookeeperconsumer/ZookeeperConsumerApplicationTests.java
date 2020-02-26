package com.ebon.zookeeperconsumer;

import com.ebon.zookeeperapi.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZookeeperConsumerApplicationTests {

    @Reference(version = "1.0.0")
    TicketService ticketService;

    @Test
    void contextLoads() {
        String ticket = ticketService.getTicket();
        System.out.println("买了一本书" + ticket);
    }

}
