package com.esliceu.dwes.configuration;

import com.esliceu.dwes.domain.Greet;
import com.esliceu.dwes.domain.Vers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


/**
 * Created by xavi on 25/01/18.
 */
@Configuration
public class Beans {
    @Bean
    public Greet greet(){
        return new Greet("hola");
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


    @Bean
    public RowMapper<Vers> versRowMapper(){

        return (resultSet, i) -> {

            Vers vers = new Vers();
            vers.setId(resultSet.getInt("idvers"));
            vers.setPosicio(resultSet.getInt("ordre"));
            vers.setVers(resultSet.getString("vers"));

            return vers;
        };

    }

}
