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
import com.ksw.service.function.JoinService;
import com.ksw.service.object.UserService;

@Controller
public class JoinController {
	
	@Autowired
	private JoinService joinService;
	
	@GetMapping("/join")
	public String tojoinPage() {
		return "join";
	}
	
	@GetMapping("/joincomplete")
	public String tojoincomplate() {
		return "joincomplete";
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute JoinDTO joinDTO, Model model) {
		
		System.out.println(joinDTO.getUserId());
		System.out.println(joinDTO.getSecurityQuestion());
		System.out.println(joinDTO.getEmail());
		System.out.println(joinDTO.getNickname());
		System.out.println(joinDTO.getSecurityAnswer());
		try {
			joinService.join(joinDTO);
			return "redirect:/joincomplete";
		} catch (Exception e){
			model.addAttribute("error", "회원가입 실패");
			System.out.println("회원가입실패");
			return "join";
		}
	};
	
}
