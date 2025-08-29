package com.imchobo.kotlin_ex.service

import com.imchobo.kotlin_ex.domain.entity.Member
import com.imchobo.kotlin_ex.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(
  private val memberRepository: MemberRepository
) {
  fun register(member: Member): Member = memberRepository.save(member)

  fun list(): List<Member> = memberRepository.findAll()
}
