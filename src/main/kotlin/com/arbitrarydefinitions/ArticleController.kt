package com.arbitrarydefinitions

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/articles/*")
class ArticleController {
    @RequestMapping("new")
    fun new(): String {
        return "articles/new"
    }

    @RequestMapping(path = arrayOf("/"), method = arrayOf(RequestMethod.POST))
    fun create(): String {
        return "redirect:/articles/omg"
    }

    @RequestMapping("/{id}")
    fun show(@PathVariable id: String): String {
        return "articles/show"
    }
}