package com.example.demo.configs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.example.demo.handlers.MyCustomLoginSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationSuccessHandler defaultSuccessUrl() {
	    return new MyCustomLoginSuccessHandler("/yourdefaultsuccessurl");
	}
	
	// Authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/books/**", "/registration", "/users","/activate/{\\d+}","/css/**", "/js/**", "/fonts/**", "/images/**", "/contacts", "/products/list", "/categories", "/category/{\\d+}").permitAll()
//                .antMatchers("/user").hasAnyRole("USER", "ADMIN")
                .antMatchers("/admin", "/edit-user/**", "/edit-book/**", "/delete-user/{\\d+}", "/delete-book/{\\d+}", "/add-category").hasAuthority("USER")
//                .antMatchers("/", "/all-books", "/add-book").hasRole("USER")
//                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .usernameParameter("email")
                .successHandler(defaultSuccessUrl())
                .permitAll()
                .and()
            .rememberMe()
                .and()
             .logout ()
                .permitAll();
                
        	
    }

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService)
			.passwordEncoder(passwordEncoder);
	}
	
    @Bean
    public PasswordEncoder getPasswordEncoder() {
    	return new BCryptPasswordEncoder(8);
    }

//     Authentication -- Sozdanie vnutrennih polizovatelei
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//             User.withDefaultPasswordEncoder()
//                .username("Andrei")
//                .password("12345")
//                .roles("USER")
//                .build();
//        UserDetails user2 =
//                User.withDefaultPasswordEncoder()
//                   .username("admin")
//                   .password("12345")
//                   .roles("ADMIN")
//                   .build();
//        
//        UserDetails[] userArr = {user, user2};
//        
//        return new InMemoryUserDetailsManager(userArr);
//    }


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
