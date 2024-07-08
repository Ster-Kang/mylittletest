package com.ksw.mylittletest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ksw.dto.forObject.entity.CategoryDTO;
import com.ksw.dto.forObject.entity.FileDTO;
import com.ksw.dto.forObject.entity.NoteDTO;
import com.ksw.dto.forObject.entity.UserDTO;
import com.ksw.object.entity.Note;
import com.ksw.service.forObject.entity.CategoryService;
import com.ksw.service.forObject.entity.FileService;
import com.ksw.service.forObject.entity.NoteService;
import com.ksw.service.forObject.entity.ReplyService;
import com.ksw.service.forObject.entity.UserService;
import com.ksw.service.function.QuestionService;
import com.ksw.service.function.ViewHistoryService;
import com.ksw.vo.forObject.entity.CategoryVO;
import com.ksw.vo.forObject.entity.FileVO;
import com.ksw.vo.forObject.entity.NoteVO;
import com.ksw.vo.forObject.entity.UserVO;
import com.ksw.vo.function.QuestionVO;
import com.ksw.vo.function.ViewHistoryVO;

@Controller
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	@Autowired
	private ViewHistoryService viewHistoryService;
	@Autowired
	private NoteService noteService;

	@GetMapping("/write")
	public String toWritePage() {
		return "write";
	}

    @GetMapping("/view")
    public String RandomViewPage(
            RedirectAttributes redirectAttributes,
            HttpSession session,
            @RequestParam("userNo") Integer userNo,
            @RequestParam("categoryNo") Integer categoryNo,
            @RequestParam(value = "noteNo", required = false) Integer noteNo) {
        if (userNo == null || categoryNo == null) {
            redirectAttributes.addFlashAttribute("error", "로그인 필요");
            return "redirect:/login"; // 로그인 페이지로 리디렉션
        }
        try {
        	List<ViewHistoryVO> viewHistory = viewHistoryService.getHistoryByCategory(categoryNo, userNo);
        	if(noteNo == null) {
        		Note randomNote = noteService.getRandomUnviewedNoteByCategory(categoryNo, userNo);
        		noteNo = randomNote.getNoteNo();
        	}
            QuestionVO newQuestionVO = questionService.Read(noteNo, userNo);
            session.setAttribute("questionVO", newQuestionVO); // 문제 정보
            session.setAttribute("viewHistory", viewHistory); // 해당 카테고리 내의 문제 중 사용자가 본 문제 조회이력
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "조회 실패");
        }
        return "view";
    }
    
    
	@PostMapping("/write")
	public String notewrite(
			@ModelAttribute NoteDTO noteDTO,
			@ModelAttribute CategoryDTO categoryDTO,
			@ModelAttribute UserDTO userDTO,
			@RequestParam("file") MultipartFile file,
			HttpSession session,
			RedirectAttributes redirectAttributes) {

            try {
            	QuestionVO questionVO = questionService.Write(noteDTO, file, categoryDTO, userDTO);
            	session.setAttribute("questionVO", questionVO);
                redirectAttributes.addFlashAttribute("message", "쓰기 성공");
                NoteVO noteVO = questionVO.getNoteVO();
                return "redirect:/view?noteNo=" + noteVO.getNoteNo();
            } catch (Exception e) {
            	redirectAttributes.addFlashAttribute("error", "쓰기 실패");
            	return "write";
            }	
	}
}
