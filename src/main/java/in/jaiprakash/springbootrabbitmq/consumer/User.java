package in.jaiprakash.springbootrabbitmq.consumer;

import in.jaiprakash.springbootrabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = "enika-Demo")
    public void consumerMessageFromQueue(OrderStatus orderStatus)
    {
        System.out.println("Message received from queue :"+ orderStatus);
    }
}
