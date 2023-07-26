package com.aopo.aopo.service.impl;

import com.aopo.aopo.domain.User;
import com.aopo.aopo.domain.mapper.UserMapper;
import com.aopo.aopo.service.UserService;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Utilities;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public String getName() {
        return userMapper.getName();
    }


    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public String getResponse() {
        List<NameValuePair> entity = new ArrayList<>();
        BasicNameValuePair basicNameValuePair = new BasicNameValuePair("condition[q]", "111");
        entity.add(basicNameValuePair);

        try {
            String lineTestUri = "http://linetest.edu.51cto.com/center/search-info/ajax-count-new?condition[q]=111";
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet(lineTestUri);
            //request.addHeader("Cookie",cookie);
            //request.addHeader("token","f528764d624db129b32c21fg63Sxbca0cb8d6");
            //request.addHeader("time","202306");
            //request.addHeader("page","1");
            // request.addHeader("Content-Type","text/html; charset=UTF-8");
            CloseableHttpResponse response = httpClient.execute(request);
            return EntityUtils.toString(response.getEntity());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return "success";
    }
}
