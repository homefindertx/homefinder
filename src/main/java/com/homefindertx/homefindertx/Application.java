package com.homefindertx.homefindertx;

import com.twilio.http.TwilioRestClient;
import com.twilio.security.RequestValidator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public TwilioRestClient twilioRestClient(@Value("${TWILIO_ACCOUNT_SID}") String accountSid,
                                             @Value("${TWILIO_AUTH_TOKEN}") String authToken){
        return new TwilioRestClient.Builder(accountSid, authToken).build();
    }


}

