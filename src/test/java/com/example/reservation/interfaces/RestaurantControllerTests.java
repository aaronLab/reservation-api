package com.example.reservation.interfaces;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RestaurantController.class)
public class RestaurantControllerTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void list() throws Exception {
        mvc.perform(get("/restaurants"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"name\":\"New Restaurant\"")
                ))
                .andExpect(content().string(
                        containsString("\"id\":1000")
                ));
    }

    @Test
    public void detail() throws Exception {
        mvc.perform(get("/restaurants/1000"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"name\":\"Old Restaurant\"")
                ))
                .andExpect(content().string(
                        containsString("\"id\":1000")
                ));
        ;

        mvc.perform(get("/restaurants/2000"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        containsString("\"name\":\"New Restaurant\"")
                ))
                .andExpect(content().string(
                        containsString("\"id\":2000")
                ));
    }

}