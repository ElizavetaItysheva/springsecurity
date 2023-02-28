package skypro.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfigNew extends WebSecurityConfigurerAdapter {
    private DataSource dataSource;
    public SecurityConfigNew(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    protected void configure( AuthenticationManagerBuilder auth ) throws Exception {
auth.jdbcAuthentication().dataSource(dataSource);
    }


    @Override
    protected void configure( HttpSecurity http ) throws Exception {
        http.authorizeRequests()
                .antMatchers("/employee_info").hasAnyRole("DIRECTOR", "SECURITY", "IT", "EMPLOYEE")
                .antMatchers("/It_info").hasAnyRole("DIRECTOR", "SECURITY", "IT")
                .antMatchers("/Security_info").hasAnyRole("DIRECTOR", "SECURITY")
                .antMatchers("/Director_info").hasAnyRole("DIRECTOR")
                .and().formLogin().permitAll();
    }
}
