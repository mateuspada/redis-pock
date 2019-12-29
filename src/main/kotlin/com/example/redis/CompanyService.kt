package com.example.redis

import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class CompanyService(private val companyRepository: CompanyRepository) {

    @Cacheable(cacheNames = [Company.CACHE_NAME], key = "#root.method.name")
    fun findAll(): List<Company> {
        return companyRepository.findAll()
    }

    @CacheEvict(cacheNames = [Company.CACHE_NAME], allEntries = true)
    fun create(company: Company): Company {
        return companyRepository.save(company)
    }

}