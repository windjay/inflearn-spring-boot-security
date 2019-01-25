package com.windjay.springboot.springsecurity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
@WithMockUser
public class HomeControllerTest {

  @Autowired
  MockMvc mockMvc;

  @Test
  public void hello () throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/hello")
          .accept(MediaType.TEXT_HTML))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isOk())
            .andExpect(view().name("hello"));

  }

  @Test
  public void my() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/my"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isOk())
            .andExpect(view().name("my"));

  }


}