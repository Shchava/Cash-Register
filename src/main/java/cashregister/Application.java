package cashregister;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cashregister.entity.User;
import cashregister.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {

            User user2 = new User();
            user2.setUsername("test3");
            user2.setEmail("hhh@example.com");
            user2.setPassword_hash("h111111111");
            user2.setRole(1);
            repository.save(user2);
            //repository.save(new User(2,"test2","hhh@example.com","h5235235"));


            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (User user : repository.findAll()) {
                log.info(user.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            repository.findById(1L)
                    .ifPresent(user -> {
                        log.info("User found with findById(1):");
                        log.info("--------------------------------");
                        log.info(user.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("User found with findUsername('test2'):");
            log.info("--------------------------------------------");
            repository.findUserByUsername("test2").forEach(user -> {
                log.info(user.toString());
            });
            log.info("");
        };
    }



}

