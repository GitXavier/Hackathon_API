package com.hackathon.doctolib.configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean
    public DataSource mysqlDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.username(System.getenv("db_username"));
        dataSourceBuilder.password(System.getenv("db_password"));
        dataSourceBuilder.url(System.getenv("db_url"));

        return dataSourceBuilder.build();
    }
}
