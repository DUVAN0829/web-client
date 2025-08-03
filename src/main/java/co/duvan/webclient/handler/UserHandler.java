package co.duvan.webclient.handler;

import co.duvan.webclient.models.UserDTO;
import co.duvan.webclient.respositories.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {

    //* Vars
    private final UserService service;

    //* Constructor
    public UserHandler(UserService service) {
        this.service = service;
    }

    //* Methods
    public Mono<ServerResponse> list(ServerRequest request) {

        return ServerResponse.ok().body(service.findAll(), UserDTO.class);

    }

    public Mono<ServerResponse> findById(ServerRequest request) {

        String id = request.pathVariable("id");

        return service.findById(id).flatMap(p -> ServerResponse.ok()
                .bodyValue(p)
                .switchIfEmpty(ServerResponse.notFound().build()));

    }




}
