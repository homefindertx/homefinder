//package com.homefindertx.homefindertx.models;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;
//import java.text.NumberFormat;
//import java.util.Currency;
//
//
//
//public class Zillow {
//    private static final DocumentBuilderFactory dbFac;
//    private static final DocumentBuilder docBuilder;
//
//    static {
//        try
//
//        {
//            dbFac = DocumentBuilderFactory.newInstance();
//            docBuilder = dbFac.newDocumentBuilder();
//        } catch (ParserConfigurationException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private static final String DEEP_URL = "http://www.zillow.com/webservice/GetDeepSearchResults.htm";
//    private static final String ZESTIMATE_URL = "http://www.zillow.com/webservice/GetZestimate.htm";
////    private static final String LOAD = "http://www.zillow.com/webservice/GetZestimate.htm?zws-id=X1-ZWz1gne0k7ob2j_7ew1d&address=750avantave&citystatezip=78210";
//
//
//    private static final String ZWSID = "X1-ZWz1gne0k7ob2j_7ew1d";
//
//    private static final NumberFormat nf = NumberFormat.getCurrencyInstance();
//
//    // Returns Zestimate value for address.
//    public static String getValuation(String address, String cityStateZip) throws SAXException, IOException {
//        Document deepDoc = docBuilder.parse(DEEP_URL +
//                "?zws-id=" + ZWSID +
//                "&address=" + address +
//                "&citystatezip=" + cityStateZip);
//        Element firstResult = (Element) deepDoc.getElementsByTagName("result").item(0);
//        String zpid = firstResult.getElementsByTagName("zpid").item(0).getTextContent();
//        Document valueDoc = docBuilder.parse(ZESTIMATE_URL +
//                "?zws-id=" + ZWSID +
//                "&zpid=" + zpid);
//        Element zestimate = (Element) valueDoc.getElementsByTagName("zestimate").item(0);
//        Element amount = (Element) zestimate.getElementsByTagName("amount").item(0);
//        String currency = amount.getAttribute("currency");
//        nf.setCurrency(Currency.getInstance(currency));
//        return nf.format(Double.parseDouble(amount.getTextContent()));
//    }
//
////    public static String getAllInfo(String address, String cityStateZip) throws SAXException, IOException {
////        Document deepDoc = docBuilder.parse(DEEP_URL +
////                "?zws-id=" + ZWSID +
////                "&address=" + address +
////                "&citystatezip=" + cityStateZip);
////        Element firstResult = (Element)deepDoc.getElementsByTagName("result").item(0); //sout = null
////
////        // ========= need this?? ===========
////        String zpid = firstResult.getElementsByTagName("zpid").item(0).getTextContent();
////        Document valueDoc = docBuilder.parse(DEEP_URL +
////                "?zws-id=" + ZWSID +
////                "&address=" + address +
////                "&zpid=" + zpid);
//////        ==================================
////
////        Element entire_address_element = (Element)valueDoc.getElementsByTagName("address").item(0);
////        Element street_name_element = (Element) entire_address_element.getElementsByTagName("street").item(0);
////        System.out.println("street element:" + street_name_element); //null ???
////        return "hello";
////    }
//
//
//    public static DocumentBuilderFactory getDbFac() {
//        return dbFac;
//    }
//
//    public static DocumentBuilder getDocBuilder() {
//        return docBuilder;
//    }
//
//    public static String getDeepUrl() {
//        return DEEP_URL;
//    }
//
//    public static String getZestimateUrl() {
//        return ZESTIMATE_URL;
//    }
//
//    public static String getZWSID() {
//        return ZWSID;
//    }
//
//    public static NumberFormat getNf() {
//        return nf;
//    }
//
////    public static String getLoad() {
////        return LOAD;
////    }
//}
//
//
//
////X1-ZWz1gne0k7ob2j_7ew1d

package com.homefindertx.homefindertx.models;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Currency;

public class Zillow
{
    private static final DocumentBuilderFactory dbFac;
    private static final DocumentBuilder docBuilder;
    static
    {
        try
        {
            dbFac = DocumentBuilderFactory.newInstance();
            docBuilder = dbFac.newDocumentBuilder();
        }
        catch(ParserConfigurationException e)
        {
            throw new RuntimeException(e);
        }
    }
    private static final String DEEP_URL = "http://www.zillow.com/webservice/GetDeepSearchResults.htm";
    private static final String ZESTIMATE_URL = "http://www.zillow.com/webservice/GetZestimate.htm";

    private static final String ZWSID = "X1-ZWz18dgy99n4sr_8jmj2";

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance();

    // Returns Zestimate value for address.
    public static String getValuation(String address, String cityStateZip) throws SAXException, IOException {
        System.out.println("hello1");

        Document deepDoc = docBuilder.parse(DEEP_URL +
                "?zws-id=" + ZWSID +
                "&address=" + address +
                "&citystatezip=" + cityStateZip);

        Element firstResult = (Element) deepDoc.getElementsByTagName("result").item(0);
        String zpid = firstResult.getElementsByTagName("zpid").item(0).getTextContent();

        Document valueDoc = docBuilder.parse(ZESTIMATE_URL +
                "?zws-id=" + ZWSID +
                "&zpid=" + zpid);

        Element zestimate = (Element) valueDoc.getElementsByTagName("zestimate").item(0);
        Element amount = (Element) zestimate.getElementsByTagName("amount").item(0);
        String currency = amount.getAttribute("currency");
        nf.setCurrency(Currency.getInstance(currency));
        return nf.format(Double.parseDouble(amount.getTextContent()));
    }







    public static String getDeepUrl() {
        return DEEP_URL;
    }
//
//    public static String getZestimateUrl() {
//        return ZESTIMATE_URL;
//    }
//
    public static String getZWSID() {
        return ZWSID;
    }
//
//    public static NumberFormat getNf() {
//        return nf;
//    }
}