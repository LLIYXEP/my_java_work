package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	
	// Authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/all-books", "/add-book").permitAll()
                .antMatchers("/user").hasAnyRole("USER", "ADMIN")
                .antMatchers("/admin").hasRole("ADMIN")
//                .antMatchers("/", "/all-books", "/add-book").hasRole("USER")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
             .logout ()
                .permitAll();
                
        	
    }

	

//     Authentication -- Sozdanie vnutrennih polizovatelei
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
             User.withDefaultPasswordEncoder()
                .username("Andrei")
                .password("12345")
                .roles("USER")
                .build();
        UserDetails user2 =
                User.withDefaultPasswordEncoder()
                   .username("admin")
                   .password("12345")
                   .roles("ADMIN")
                   .build();
        
        UserDetails[] userArr = {user, user2};
        
        return new InMemoryUserDetailsManager(userArr);
    }


//    Sozdanie Polizovatelei 4erez BD
    
//    @Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication()
//			.dataSource(dataSource);
//	}
    
//    // Kodirovka parolia
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return new BCryptPasswordEncoder(8);
//    }
}
