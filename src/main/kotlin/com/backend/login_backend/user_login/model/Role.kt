package com.backend.login_backend.user_login.model


import java.util.*
import javax.persistence.*

@Entity
@Table(name = "roles")
data class Role(

    @Id
    var id: String = UUID.randomUUID().toString(),

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    var name: ERole = ERole.ROLE_USER,
)
