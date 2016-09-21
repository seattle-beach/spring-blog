package com.arbitrarydefinitions

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl

@RunWith(SpringRunner::class)
@WebMvcTest(HomeController::class)
class HomeControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @InjectMocks
    lateinit var controller: HomeController

    @Test
    fun indexShouldRedirectToWelcome() {
        this.mockMvc.perform(get("/")).andExpect(redirectedUrl("/welcome"))
    }
}