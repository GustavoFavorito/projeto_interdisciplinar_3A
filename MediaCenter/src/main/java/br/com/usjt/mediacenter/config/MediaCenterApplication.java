package br.com.usjt.mediacenter.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"br.com.usjt.mediacenter.model"})
public class MediaCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediaCenterApplication.class, args);
	}

}
