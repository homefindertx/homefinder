package com.homefindertx.homefindertx;

import com.twilio.Twilio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
public class HomefindertxApplication implements ApplicationRunner{

//    public static void main(String[] args) {
//        SpringApplication.run(HomefindertxApplication.class, args);
//    }



    private final static String ACCOUNT_SID = "AC151a6a2ab1e93f1ad6840c48c7eb98ef";
    private final static String AUTH_ID = "d6d95fbaf85b2ef2e5a2f7fb2e756ee8";

    static {
        Twilio.init(ACCOUNT_SID, AUTH_ID);
    }
    public static void main(String[] args) {
        SpringApplication.run(HomefindertxApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments arg0) throws Exception {


////TO RECEIVE A TEXT MESSAGE WHEN APPLICATION RUNS
//        Message.creator(new PhoneNumber("+15735861642"), new PhoneNumber("+12074069544"),
//                "The team says Harrooo!").create();
//
//        //TO RECEIVE A CALL WHEN APPLICATION RUNS
////        Call.creator(new PhoneNumber("+15735861642"), new PhoneNumber("+12074069544"),
////                new URI("http://demo.twilio.com/docs/voice.xml")).create();
//    }
    }


}
