package com.mercadolivro.service

import com.mercadolivro.model.BookModel
import com.mercadolivro.repository.BookReposidory
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookReposidory: BookReposidory
) {
    fun create(book: BookModel) {
        bookReposidory.save(book)

    }

}
