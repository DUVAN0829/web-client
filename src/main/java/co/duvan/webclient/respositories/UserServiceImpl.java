package co.duvan.webclient.respositories;

import co.duvan.webclient.models.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    //* Vars
    private final WebClient client;

    //* Constructor
    public UserServiceImpl(WebClient client) {
        this.client = client;
    }

    @Override
    public Mono<UserDTO> findById(String id) {
        return client.get().uri("/{id}", Map.of("id", id))
                .retrieve()
                .bodyToMono(UserDTO.class);
    }

    @Override
    public Flux<UserDTO> findAll() {
        return client.get()
                .retrieve()
                .bodyToFlux(UserDTO.class);
    }

    @Override
    public Mono<UserDTO> save(UserDTO user) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return client.delete().uri("/{id}", Map.of("id", id))
                .retrieve()
                .bodyToMono(Void.class);
    }

}







