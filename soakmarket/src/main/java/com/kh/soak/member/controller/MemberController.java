package com.kh.soak.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.soak.member.model.service.MemberService;
import com.kh.soak.member.model.vo.Member;

import ch.qos.logback.core.model.Model;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt; 
	
	
	
	@RequestMapping("login.me")
	public String loginMember(Member m
							 ,HttpSession session
							 ,Model model) {
		
		
		
		
	}
	
}
