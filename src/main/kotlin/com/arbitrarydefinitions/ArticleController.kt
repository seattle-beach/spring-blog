package com.arbitrarydefinitions

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/articles")
class ArticleController {
    @Autowired
    lateinit var repository: ArticleRepository

    @RequestMapping("/new")
    fun new(model: Model): String {
        var article = Article()
        article.title = "ohai"
        article.text = "omg"
        model.addAttribute("article", article)
        return "articles/new"
    }

    @RequestMapping(method = arrayOf(RequestMethod.POST))
    fun create(article: Article): String {
        repository.save(article)

        return "redirect:/articles/" + article.id
    }

    @RequestMapping("/{id}")
    fun show(@PathVariable id: Long, model: Model): String {
        var article = repository.findOne(id)
        model.addAttribute("article", article)
        return "articles/show"
    }
}