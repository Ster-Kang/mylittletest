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

import com.ksw.dto.forObject.object.CategoryDTO;
import com.ksw.dto.forObject.object.FileDTO;
import com.ksw.dto.forObject.object.NoteDTO;
import com.ksw.dto.forObject.object.UserDTO;
import com.ksw.object.entity.jpa.Note;
import com.ksw.object.vo.combined.QuestionVO;
import com.ksw.object.vo.combined.ViewHistoryVO;
import com.ksw.object.vo.object.CategoryVO;
import com.ksw.object.vo.object.FileVO;
import com.ksw.object.vo.object.NoteVO;
import com.ksw.object.vo.object.UserVO;
import com.ksw.service.forObject.object.CategoryService;
import com.ksw.service.forObject.object.FileService;
import com.ksw.service.forObject.object.NoteService;
import com.ksw.service.forObject.object.ReplyService;
import com.ksw.service.forObject.object.UserService;
import com.ksw.service.function.QuestionService;
import com.ksw.service.function.ViewHistoryService;

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
            redirectAttributes.addFlashAttribute("error", "�α��� �ʿ�");
            return "redirect:/login"; // �α��� �������� ���𷺼�
        }
        try {
        	List<ViewHistoryVO> viewHistory = viewHistoryService.getHistoryByCategory(categoryNo, userNo);
        	if(noteNo == null) {
        		Note randomNote = noteService.getRandomUnviewedNoteByCategory(categoryNo, userNo);
        		noteNo = randomNote.getNoteNo();
        	}
            QuestionVO newQuestionVO = questionService.Read(noteNo, userNo);
            session.setAttribute("questionVO", newQuestionVO); // ���� ����
            session.setAttribute("viewHistory", viewHistory); // �ش� ī�װ� ���� ���� �� ����ڰ� �� ���� ��ȸ�̷�
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "��ȸ ����");
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
                redirectAttributes.addFlashAttribute("message", "���� ����");
                NoteVO noteVO = questionVO.getNoteVO();
                return "redirect:/view?noteNo=" + noteVO.getNoteNo();
            } catch (Exception e) {
            	redirectAttributes.addFlashAttribute("error", "���� ����");
            	return "write";
            }	
	}
}
