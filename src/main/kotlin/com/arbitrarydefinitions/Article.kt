package com.arbitrarydefinitions

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Article {
        var title: String = ""
        var text: String = ""
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0

        @CreatedDate
        lateinit var createdDate: LocalDateTime

        @LastModifiedDate
        lateinit var lastModifiedDate: LocalDateTime
}