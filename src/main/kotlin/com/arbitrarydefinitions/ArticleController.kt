package com.arbitrarydefinitions

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/articles/*")
class ArticleController {
    @RequestMapping("new")
    fun new(): String {
        return "articles/new"
    }
}