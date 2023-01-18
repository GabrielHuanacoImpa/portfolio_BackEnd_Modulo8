package com.mipagina.apiporfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiporfolioApplication {
    //public static final String URL_FROND_END = "http://localhost:4200";
    //public static final String URL_FROND_END = "https://porfolioghi.firebaseapp.com/";
    public static final String URL_FROND_END = "https://porfolioghi.web.app/";

    public ApiporfolioApplication() {
        
    }
        
	public static void main(String[] args) {
		SpringApplication.run(ApiporfolioApplication.class, args);
                
                
	}

}
