package com.imchobo.kotlin_ex.repository

import com.imchobo.kotlin_ex.domain.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>
