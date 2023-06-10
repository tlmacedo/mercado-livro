package com.mercadolivro.service

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerReposidory
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerReposidory: CustomerReposidory
) {

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerReposidory.findByNameContaining(it)
        }
        return customerReposidory.findAll().toList()
    }

    fun getCustomer(id: Int): CustomerModel {
        return customerReposidory.findById(id).orElseThrow()
    }

    fun create(customer: CustomerModel) {
        customerReposidory.save(customer)
    }

    fun update(customer: CustomerModel) {
        if (!customerReposidory.existsById(customer.id!!))
            throw Exception()
        customerReposidory.save(customer)
    }

    fun delete(id: Int) {
        if (!customerReposidory.existsById(id))
            throw Exception()
        customerReposidory.deleteById(id)
    }

}