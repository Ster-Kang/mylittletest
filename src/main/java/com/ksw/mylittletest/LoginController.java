package com.ksw.mylittletest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ksw.dto.forUtil.LoginDTO;
import com.ksw.object.vo.UserVO;
import com.ksw.service.object.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String toLoginPage() {
		return "login";
	}
	
	/*
	 * �α��� ����� Spring Security�� ���ؼ� �����߽��ϴ�. 
	 * 
	 * ��� Form�� �Ʒ��� �� �±׸� �־��ּ���.
	 * <sec:csrfInput />
	 * 
	 * ����)
	 * <form method="post" action="/login">
	 *     <sec:csrfInput />
	 *     <input...  />
	 * </form>
	 * 
	 */
	
	
}
