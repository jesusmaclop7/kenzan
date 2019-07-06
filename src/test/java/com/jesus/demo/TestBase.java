package com.jesus.demo;


import java.util.Collections;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.jesus.demo.ClientsWsApplication;


/**
 * Created by Jesus
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ClientsWsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class TestBase {

    @Autowired
    protected TestRestTemplate template;

    @Before
    public void before() {
        //finish implementation
        template.getRestTemplate().setInterceptors(Collections.singletonList((request, body, execution) -> {
            request.getHeaders()
                    .add("client", "clients");
            return execution.execute(request, body);
        }));
    }

}
