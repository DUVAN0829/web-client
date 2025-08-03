package co.duvan.webclient;

import co.duvan.webclient.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> rutas(UserHandler handler) {

        return RouterFunctions.route(RequestPredicates.GET("/api/client"), handler::list)
                .andRoute(RequestPredicates.GET("/api/client/{id}"), handler::findById);

    }

}
