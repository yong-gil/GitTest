package com.board.test.contoller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.test.dto.MemberDto;
import com.board.test.service.IMemberService;

@Controller
public class MemberContorller {

	@Resource(name = "memberService")
	IMemberService memberService;
	
	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}
	
	@RequestMapping("addMember")
	public String addMember() {
		return "join";
	}
	
	@RequestMapping("addMemberOk")
	public String addMemberOk(MemberDto dtos) {
		return "login";
	}
	
	@RequestMapping("login")
	public String loginProcess(HttpSession session,@RequestParam("id") String id,@RequestParam("pwd") String pwd) {
		return "index";
	}
	
}
