package com.seattlebeach

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
@WebMvcTest(ArticleController::class)
class ArticleControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @InjectMocks
    lateinit var controller: ArticleController

    @Test
    fun newShouldDoStuff() {
        this.mockMvc.perform(get("/articles/new"))
                .andExpect(status().isOk)
                .andExpect(content().string(containsString("New Article")))
    }
}