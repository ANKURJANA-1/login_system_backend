package com.backend.login_backend.user_login.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Id
import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class User(

    @Id
    var id: String = UUID.randomUUID().toString(),

    @Column(nullable = false)
    var userName: String = "",

    @NotBlank(message = "email must be filled")
    @NotNull(message = "please provide email")
    @Size(max = 120)
    @Column(unique = true)
    var email: String = "",

    @Valid
    @NotBlank(message = "password must be filled")
    @NotNull(message = "please provide password")
    @Size(max = 120)
    var password: String = ""
)
