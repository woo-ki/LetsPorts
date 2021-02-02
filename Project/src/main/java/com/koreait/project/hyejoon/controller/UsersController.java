package com.koreait.project.hyejoon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.koreait.project.hyejoon.command.UsersLoginCommand;
import com.koreait.project.hyejoon.config.HyeAppContext;

@Controller
public class UsersController {
	
	@Autowired
	private SqlSession sqlSession;
	private AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(HyeAppContext.class);
	private UsersLoginCommand usersLoginCommand = ctx.getBean("usersLoginCommand", UsersLoginCommand.class);
	
	/***** 단순 이동 *****/
	
	// header페이지에서 '로그인' 버튼 클릭시 로그인 페이지로 이동한다.
	@RequestMapping(value="usersLoginPage.hey")
	public String usersLoginPage() {
		return "hyePages/usersLoginPage";
	}
	
	// 회원가입 버튼을 눌렀을 때 회원 가입 선택 페이지로 이동
	@RequestMapping(value="signUpChoicePage.hey")
	public String signUpChoicePage() {
		return "hyePages/signUpChoicePage";
	}
	
	// 회원가입 정보입력 페이지로 이동
	@RequestMapping(value="usersSignUpInsert.hey")
	public String usersSignUpInsert() {
		return "hyePages/usersSignUpInsert";
	}

	
	
	/***** 정보 전달 *****/
	@RequestMapping(value="usersLogin.hey", method=RequestMethod.POST)
	public String usersLogin(HttpServletRequest request, Model model, RedirectAttributes redirect) {
		model.addAttribute("request", request);
		model.addAttribute("redirect", redirect);
		usersLoginCommand.execute(sqlSession, model);
		return "redirect:usersLoginPage.hey";	// redirect = 옆에적은 경로의 url로 이동한다.( 그 전에 있던 request 정보만 없다.)
		// 실행한 다음에 다른 컨트롤러를 추가로 실행해준다.
		
		// request에서 map에 저장하기
		// Map<String, Object> map = model.asMap();
		
		// int loginResult = (int)map.get("loginResult");
		
		// false:0, true:1
		/*
		if(loginResult == 0) {
			return "hyePages/usersLoginPage";
		} else {
			return "redirect:index";
		}
		*/
	}
	
	@RequestMapping(value="usersLogout.hey")
	public String usersLogout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("loginUser");
		return "redirect:/";
	}
	
	
	
}