package com.example.redis

import java.io.Serializable
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Company(@Id val identifier: String = UUID.randomUUID().toString(),
                   val name: String? = null) : Serializable {
    companion object {
        const val CACHE_NAME = "Company"
    }
}