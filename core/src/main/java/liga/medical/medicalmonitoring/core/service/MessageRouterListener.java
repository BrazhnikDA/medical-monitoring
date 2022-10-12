package liga.medical.medicalmonitoring.core.service;

import liga.medical.medicalmonitoring.core.api.MessageRouterService;
import liga.medical.medicalmonitoring.core.model.MessageQueueNames;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageRouterListener {
    private final MessageRouterService rabbitRouterService;

    @RabbitListener(queues = MessageQueueNames.ROUTER_QUEUE_NAME)
    public void receiveAndRedirectMessage(String message) {
        rabbitRouterService.routeMessage(message);
    }
}
