package com.backend.login_backend.user_login.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.security.core.userdetails.User
import org.springframework.stereotype.Repository


@Repository
interface UserRepository : JpaRepository<User, String> {
}