package com.imchobo.kotlin_ex.controller

import com.imchobo.kotlin_ex.domain.entity.Member
import com.imchobo.kotlin_ex.service.MemberService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/members")
class MemberController(
  private val memberService: MemberService
) {
  @PostMapping
  fun register(@RequestBody member: Member): Member =
    memberService.register(member)

  @GetMapping
  fun list(): List<Member> = memberService.list()
}
