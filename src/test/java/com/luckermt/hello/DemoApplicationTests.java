package com.luckermt.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.luckermt.hello.Controller.HelloController;
import com.luckermt.hello.Service.HelloService;

@WebMvcTest(HelloController.class)
public class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testPing() throws Exception {
        mockMvc.perform(get("/api/hello"))
        .andExpect(status().isOk());
    }
    //comm
    @Test
    void testHello() throws Exception {
        HelloService.getHello();
    }
}

