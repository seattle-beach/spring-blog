package com.arbitrarydefinitions

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class WelcomeController {
    @RequestMapping("/welcome")
    fun welcome(@RequestParam(value="name", required = false, defaultValue = "World") name: String, model: Model): String {
        model.addAttribute("name", name)
        return "welcome"
    }
}