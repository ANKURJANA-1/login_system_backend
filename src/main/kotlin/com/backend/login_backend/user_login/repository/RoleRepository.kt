package com.backend.login_backend.user_login.repository

import com.backend.login_backend.user_login.model.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository : JpaRepository<Role, String> {
}