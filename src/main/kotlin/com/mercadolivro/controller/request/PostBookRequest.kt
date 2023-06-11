package com.mercadolivro.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import jakarta.persistence.*
import java.math.BigDecimal

data class PostBookRequest(
    var nome: String,
    var price: BigDecimal,

    @JsonAlias("customer_id")
    var customerId: Int? = null
)
