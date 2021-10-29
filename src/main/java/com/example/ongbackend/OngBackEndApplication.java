package com.example.ongbackend;

import com.example.ongbackend.model.User;
import com.example.ongbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OngBackEndApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OngBackEndApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
    this.userRepository.save(new User("Salihou", "Maiga","Gao","13-12-2010","77-26-10-50","zoulka@gmail.com"));
    this.userRepository.save(new User("Mainmouna", "Maiga","Gao","16-01-1992", "15-50-98-90", "quelqun@yahoo.fr"));
        this.userRepository.save(new User("Laila", "Maiga", "Gao","29-06-1999","76-98-45-81","moussa@yahoo.com"));
        this.userRepository.save(new User("Kaga", "Maiga","Gao","01-02-1996","09-08-06-54","ivo@yahoo.com"));
    }
}
