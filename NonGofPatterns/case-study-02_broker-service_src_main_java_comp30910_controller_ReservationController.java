package comp30910.controller;

import comp30910.model.RequestMessage;
import comp30910.model.Reservation;
import comp30910.service.BrokerService;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.utils.SerializationUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cinema")
public class ReservationController {
    private final BrokerService brokerService;

    @Value("${amqp.request.routingKey}")
    private String requestRoutingKey;

    @PostMapping("/{cinemaName}/reservation/make")
    public String makeReservation(
            @PathVariable String cinemaName, @RequestBody Reservation reservation) {
        String endpoint = "/reservation/make";
        String routingKey = String.format("%s.%s", requestRoutingKey, cinemaName);
        String correlationId =
                brokerService.sendRequest(new RequestMessage(endpoint, reservation), routingKey);
        return correlationId;
    }

    @GetMapping("/{cinemaName}/reservation/make/{correlationId}")
    public Reservation makeReservationResponse(@PathVariable String correlationId) {
        List<Message> responses = brokerService.fetchResponseFromCache(correlationId);
        return responses.stream()
                .map(r -> (Reservation) SerializationUtils.deserialize(r.getBody()))
                .findFirst()
                .get();
    }

    @GetMapping("/{cinemaName}/reservation/list")
    public String listReservations(@PathVariable String cinemaName) {
        String endpoint = "/reservation/list";
        String routingKey = String.format("%s.%s", requestRoutingKey, cinemaName);
        String correlationId =
                brokerService.sendRequest(new RequestMessage(endpoint, null), routingKey);
        return correlationId;
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/{cinemaName}/reservation/list/{correlationId}")
    public List<Reservation> listReservationsResponse(@PathVariable String correlationId) {
        List<Message> responses = brokerService.fetchResponseFromCache(correlationId);
        return responses.stream()
                .map(r -> (List<Reservation>) SerializationUtils.deserialize(r.getBody()))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
