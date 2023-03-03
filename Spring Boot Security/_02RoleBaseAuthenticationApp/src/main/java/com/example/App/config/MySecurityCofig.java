package com.example.App.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityCofig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http
               .csrf().disable()
               //this is important otherwise at the time of put and post method it wont work... scrf is the attack
               .authorizeRequests()
//               .antMatchers("/public/**").hasRole("NORMAL")
//               .antMatchers("/users/**").hasRole("ADMIN")
               // we can also use this same thing via @PreAutherize("hassRole('ADMIN') in controller
               .anyRequest()
               .authenticated()
               .and()
               .httpBasic();

    }

    // in anymatcher i can tell like -> ("/public"/**) it indicates for all
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("pranshu").password(this.passwordEncoder().encode("bisht")).roles("NORMAL");
    auth.inMemoryAuthentication().withUser("hrithik").password(this.passwordEncoder().encode("bisht")).roles("ADMIN");


    }

    @Bean
    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
        return new BCryptPasswordEncoder(10);
    }
}

