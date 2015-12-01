package org.duprez.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories()
public class GitShowcaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitShowcaseApplication.class, args);
    }
}
