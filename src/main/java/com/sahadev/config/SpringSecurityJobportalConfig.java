package com.sahadev.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SpringSecurityJobportalConfig extends WebSecurityConfigurerAdapter {
  
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public PasswordEncoder getpasswordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select username,password,active from user_tbl where username=?")
		//userByUsernameQuery authenticates user and checks if it is active or not
		.authoritiesByUsernameQuery("select ut.username,rt.role from user_tbl as ut,"
				+" role_table as rt where ut.user_id=rt.user_id and ut.username=?")
		.passwordEncoder(passwordEncoder);
		//password has been encrypted in database
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.csrf()
		.disable()
		.authorizeRequests()
		.antMatchers("/admin/**").hasRole("ADMIN")
		.antMatchers("/user/**").hasRole("USER")
		.antMatchers("/employeer/**").hasRole("EMPLOYEER")
		.antMatchers("/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login")
		.loginProcessingUrl("/login")
		.usernameParameter("username")
		.passwordParameter("password")
		.defaultSuccessUrl("/index")
		//.successHandler(new UserAuthenticationSuccessHandler())
		.successHandler(new CustomSuccessHandler())
		.failureUrl("/login?error=true")
		.permitAll()
		.and()
		.logout()
		.logoutUrl("/logout")
		.logoutSuccessUrl("/login?logout=true")
		.invalidateHttpSession(true)
		.permitAll();
	}
}
