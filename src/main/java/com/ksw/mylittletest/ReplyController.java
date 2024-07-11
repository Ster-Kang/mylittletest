package com.ksw.mylittletest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ksw.dto.forObject.entity.ReplyDTO;
import com.ksw.dto.forObject.entity.UserDTO;
import com.ksw.dto.function.QuestionDTO;
import com.ksw.object.entity.Reply;
import com.ksw.service.forObject.entity.ReplyService;
import com.ksw.service.forObject.relation.NoteReplyService;
import com.ksw.service.forObject.relation.ReplyUserService;

@Controller
public class ReplyController {

	@Autowired
	private NoteReplyService noteReplyService; 
	
	@Autowired
	private ReplyService replyService;
	
	@Autowired
	private ReplyService userService;
	
	@Autowired 
	private ReplyUserService replyUserService;
	
	/*
	 * @PostMapping("/replyWrite") public String replyWrite(
	 * 
	 * @RequestParam(name = "noteNo", required = false) Integer noteNo,
	 * 
	 * @ModelAttribute ReplyDTO replyDTO,
	 * 
	 * @ModelAttribute UserDTO userDTO) { replyService.writeReply(replyDTO);
	 * replyUserService.writeReplyRelation(replyDTO, userDTO); return
	 * "redirect:/view?noteNo=" + noteNo; }
	 */
}
