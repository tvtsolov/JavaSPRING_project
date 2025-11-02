package dev1.tvtsolov.com.runnerz;

import dev1.tvtsolov.com.runnerz.run.Location;
import dev1.tvtsolov.com.runnerz.run.Run;
import dev1.tvtsolov.com.runnerz.run.RunRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//    @Bean
//    CommandLineRunner runner(RunRepository runRepository) {
//        return args -> {
//            Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
//            //log.info
//            runRepository.create(run);
//        };
//    }



}
