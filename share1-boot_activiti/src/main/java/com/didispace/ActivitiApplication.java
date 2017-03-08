package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.didispace.domain.Comp;
import com.didispace.domain.CompRepository;
import com.didispace.domain.Person;
import com.didispace.domain.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ActivitiApplication {
   @Autowired
   private CompRepository compRepository;
   @Autowired
   private PersonRepository personRepository;
   
   
   public static void main(String[] args) {
      SpringApplication.run(ActivitiApplication.class, args);
   }
   
   //初始化模拟数据
   @Bean
   public CommandLineRunner init() {
      return new CommandLineRunner() {
         public void run(String... strings) throws Exception {
            if (personRepository.findAll().size() == 0) {
               personRepository.save(new Person("wtr"));
               personRepository.save(new Person("wyf"));
               personRepository.save(new Person("admin"));
            }
            if (compRepository.findAll().size() == 0) {
               Comp group = new Comp("great company");
               compRepository.save(group);
               Person admin = personRepository.findByPersonName("admin");
               Person wtr = personRepository.findByPersonName("wtr");
               admin.setComp(group); wtr.setComp(group);
               personRepository.save(admin); personRepository.save(wtr);
            }
         }
      };
   }
}
