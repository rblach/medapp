package pl.medapp.security;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfiguration {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public AuthenticationManager authManager(
//        HttpSecurity http,
//        BCryptPasswordEncoder passwordEncoder,
//        UserDetailsService userDetailService
//    )
//        throws Exception {
//        return http.getSharedObject(AuthenticationManagerBuilder.class)
//            .userDetailsService(userDetailService)
//            .passwordEncoder(passwordEncoder)
//            .and()
//            .build();
//    }

    @Bean
    @ConditionalOnProperty(value = "spring.security.enabled", havingValue = "true", matchIfMissing = true)
    SecurityFilterChain securityEnabled(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests((authorize) ->
                authorize.requestMatchers(new AntPathRequestMatcher("/registration")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/home")).permitAll()
                    .requestMatchers(new AntPathRequestMatcher("/username")).authenticated()
            ).formLogin(
                form -> form
                    .loginPage(("/login"))
                    .loginProcessingUrl("/login")
                    .defaultSuccessUrl("/home")
                    .permitAll()
            ).logout(
                logout -> logout
                    .logoutRequestMatcher(new AntPathRequestMatcher("/login?logout"))
                    .permitAll()
            );
        return http.build();
    }

    @Bean
    @ConditionalOnProperty(value = "spring.security.enabled", havingValue = "false")
    SecurityFilterChain securityDisabled(HttpSecurity http) throws Exception {
        http.csrf()
            .disable()
            .authorizeHttpRequests()
            .anyRequest()
            .permitAll();

        return http.build();
    }

    @Autowired
    @Lazy
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
}