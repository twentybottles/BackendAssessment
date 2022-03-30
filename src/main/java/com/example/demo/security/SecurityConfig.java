package com.example.demo.security;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import static com.example.demo.common.WebConst.LOCAL_HOST_3000;
import static com.example.demo.common.WebConst.CARDETAIL_REGISTER_URL;
import static com.example.demo.common.WebConst.POST;
import static com.example.demo.common.WebConst.GET;


@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

    	http
        .authorizeRequests()
        	.mvcMatchers(CARDETAIL_REGISTER_URL).permitAll()
            .anyRequest().authenticated()
            .and()
        .csrf()
//    		.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        	.disable()
        .cors()
            .configurationSource(this.corsConfigurationSource())
        ;

	}
	
    private CorsConfigurationSource corsConfigurationSource() {
    	
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowedOrigins(Arrays.asList(CorsConfiguration.ALL));
		corsConfiguration.setAllowedMethods(Arrays.asList(POST,GET));
		corsConfiguration.setAllowedHeaders(Arrays.asList(CorsConfiguration.ALL));
		corsConfiguration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", corsConfiguration);
        return corsSource;

    }
}
