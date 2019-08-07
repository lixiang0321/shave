package net.shavedog.eureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Configuration
@EnableWebSecurity
public class EurekaWebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**")  ;//忽略Eureka的所有路径
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
                return new UserDetails() {
                    @Override
                    public Collection<? extends GrantedAuthority> getAuthorities() {
                        Collection<GrantedAuthority> roles = new ArrayList<>();
                        roles.add(new GrantedAuthority() {
                            @Override
                            public String getAuthority() {
                                return "USER";
                            }
                        });
                        return null;
                    }

                    @Override
                    public String getPassword() {
                        return "mingyuan";
                    }

                    @Override
                    public String getUsername() {
                        return "mingyuan";
                    }

                    @Override
                    public boolean isAccountNonExpired() {
                        return true;
                    }

                    @Override
                    public boolean isAccountNonLocked() {
                        return true;
                    }

                    @Override
                    public boolean isCredentialsNonExpired() {
                        return true;
                    }

                    @Override
                    public boolean isEnabled() {
                        return true;
                    }
                };
            }
        });
    }
}
