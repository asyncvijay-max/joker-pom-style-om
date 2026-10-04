package org.nonbdd.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.nonbdd.pojo.BillingAddress;

import java.io.IOException;
import java.io.InputStream;

public class JacksonUtils {

    public static <T> T deserialisedJson(String path, Class <T> T) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        InputStream is = JacksonUtils.class.getClassLoader().getResourceAsStream(path);
        return objectMapper.readValue(is,T);

    }


//    public static BillingAddress deserialisedJson(InputStream is, BillingAddress billingAddress) throws IOException {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.readValue(is,billingAddress.getClass());
//
//    }

}
