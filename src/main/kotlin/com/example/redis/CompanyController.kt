package com.example.redis

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/company")
class CompanyController(private val companyService: CompanyService) {

    @GetMapping
    fun findAll(): List<Company> {
        return companyService.findAll()
    }

    @PostMapping
    fun create(@RequestBody company: Company): Company {
        return companyService.create(company)
    }

}