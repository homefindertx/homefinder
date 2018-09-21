package com.homefindertx.homefindertx.controllers;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CallController {


    public static final String  TWILIO_ACCOUNT_SID= "AC151a6a2ab1e93f1ad6840c48c7eb98ef";
    public static final String TWILIO_AUTH_TOKEN = "d6d95fbaf85b2ef2e5a2f7fb2e756ee8";
    public static final String TWILIO_NUMBER ="+12074069544";

    @RequestMapping("/calltwilio")
    public String greeting() {
        return "twilio";
    }


//SENDING SMS

    public void sendSMS() {
        try {
            TwilioRestClient client = new TwilioRestClient(TWILIO_ACCOUNT_SID, TWILIO_AUTH_TOKEN);

            // Build a filter for the MessageList
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("Body", "HomeFinderNatl values your business. An Associate will contact you shortly!"));
            params.add(new BasicNameValuePair("To", "+15735861642")); //Add real number here
            params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message.getSid());
        }
        catch (TwilioRestException e) {
            System.out.println(e.getErrorMessage());
        }
    }



    @RequestMapping("/twilio")
    public String smsTwilio() {
        sendSMS();
        return "home";
    }




}


