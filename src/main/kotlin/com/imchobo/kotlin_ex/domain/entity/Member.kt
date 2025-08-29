package com.imchobo.kotlin_ex.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank


@Entity
data class Member(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,

  @field:NotBlank(message = "이름은 필수값입니다.")
  val name: String,

  @field:Email(message = "이메일 형식이 아닙니다.")
  val email: String
)
