package com.arbitrarydefinitions

import org.hamcrest.Matchers.containsString
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
@WebMvcTest(WelcomeController::class)
class WelcomeControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @InjectMocks
    lateinit var controller: WelcomeController

    @Test
    fun welcomeShouldHaveDefaultName() {
        this.mockMvc.perform(get("/welcome"))
                .andExpect(status().isOk)
                .andExpect(content().string(containsString("Hello, World!")))
    }

    @Test
    fun welcomeShouldRespectName() {
        this.mockMvc.perform(get("/welcome?name=Gregg"))
                .andExpect(status().isOk)
                .andExpect(content().string(containsString("Hello, Gregg!")))
    }
}