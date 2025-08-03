package co.duvan.webclient.respositories;

import co.duvan.webclient.models.UserDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<UserDTO> findById(String id);

    Flux<UserDTO> findAll();

    Mono<UserDTO> save(UserDTO user);

    Mono<Void> deleteById(String id);

}
