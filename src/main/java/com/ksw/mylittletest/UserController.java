package com.ksw.mylittletest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ksw.dto.forUtil.JoinDTO;
import com.ksw.dto.forUtil.LoginDTO;
import com.ksw.object.vo.UserVO;
import com.ksw.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/join")
	public String tojoinPage() {
		return "join";
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute JoinDTO joinDTO, Model model) {
		
		System.out.println(joinDTO.getUserId());
		System.out.println(joinDTO.getSecurityQuestion());
		System.out.println(joinDTO.getEmail());
		System.out.println(joinDTO.getNickname());
		System.out.println(joinDTO.getSecurityAnswer());
		try {
			userService.join(joinDTO);
			return "redirect:/joincomplete";
		} catch (Exception e){
			model.addAttribute("error", "ȸ������ ����");
			System.out.println("ȸ�����Խ���");
			return "join";
		}
	};
	
	@GetMapping("/joincomplete")
	public String tojoincomplate() {
		return "joincomplete";
	}
}
