package com.ksw.mylittletest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String showJoinPage() {
        return "join";
    }
	
	@GetMapping("/joincomplete")
	public String tojoincomplate() {
		return "joincomplete";
	}
	
    @PostMapping("/join")
    public String join(@ModelAttribute JoinDTO joinDTO, RedirectAttributes redirectAttributes) {
        try {
            joinService.join(joinDTO);
            redirectAttributes.addFlashAttribute("success", "회원가입 성공");
            return "redirect:/joincomplete";
        } catch (Exception e){
            redirectAttributes.addFlashAttribute("error", "회원가입 실패");
            System.out.println("회원가입 실패");
            return "redirect:/join";
        }
    }
	
}
