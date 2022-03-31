package com.example.demo.security;

import static com.example.demo.common.WebConst.CARDETAIL_FINDALL_URL;
import static com.example.demo.common.WebConst.CARDETAIL_FIND_URL;
import static com.example.demo.common.WebConst.CARDETAIL_REGISTER_URL;
import static com.example.demo.common.WebConst.CARDETAIL_UPDATE_URL;
import static com.example.demo.common.WebConst.CARDETAIL_DELETE_URL;
import static com.example.demo.common.WebConst.GET;
import static com.example.demo.common.WebConst.POST;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

    	http
        .authorizeRequests()
        	.mvcMatchers(CARDETAIL_REGISTER_URL).permitAll()
        	.mvcMatchers(CARDETAIL_FIND_URL).permitAll()
        	.mvcMatchers(CARDETAIL_FINDALL_URL).permitAll()
        	.mvcMatchers(CARDETAIL_UPDATE_URL).permitAll()
        	.mvcMatchers(CARDETAIL_DELETE_URL).permitAll()
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
