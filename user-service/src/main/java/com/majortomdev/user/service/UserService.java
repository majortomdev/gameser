package com.majortomdev.user.service;
//By JoeK 13-04-22
import com.majortomdev.user.UserWithField.ResponseTemplateUWF;
import com.majortomdev.user.repository.UserRepository;
import com.majortomdev.user.entity.User;
import com.majortomdev.user.UserWithField.Field;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient.Builder webClientBuilder;
//
//    @Autowired
//    private WebClient webClient;

    public User saveUser(User user) {
        log.info("inside saveUser of userService");
        return userRepository.save(user);
    }

//    public ResponseTemplateUWF getUserWithField(Long userId) {
//        log.info("inside getUserWithField of userService");
//        ResponseTemplateUWF userWF = new ResponseTemplateUWF();
//        User user = userRepository.findByUserId(userId);
//
//        Field fllield = restTemplate.getForObject("http://localhost:9001/fields/" + user.getFieldId(), Field.class);
//
////        Field field = webClient.get()
////                .uri("http://localhost:9001/fields/" + user.getFieldId())
////                .retrieve()
////                .
//        webClient = WebClient.create("http://localhost:9001/fields/" + user.getFieldId());
//        Mono<Field> field = webClient.get()
//                .retrieve()
//                .bodyToMono(Field.class);
//
//
//
//
//        userWF.setUser(user);
//        userWF.setField(field.subscribe());
//        return userWF;
//    }


    public ResponseTemplateUWF getUserWithField(Long userId) {
        log.info("inside getUserWithField of userService");
        ResponseTemplateUWF userWF = new ResponseTemplateUWF();
        User user = userRepository.findByUserId(userId);

        Field field = restTemplate.getForObject("http://FIELD-SERVICE/fields/" + user.getFieldId(), Field.class);
        userWF.setUser(user);
        userWF.setField(field);
        return userWF;
    }

}
