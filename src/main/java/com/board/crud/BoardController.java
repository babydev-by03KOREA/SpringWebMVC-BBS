package com.board.crud;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.crud.dto.BoardDTO;
import com.board.crud.service.BoardService;

@Controller
@RequestMapping(value = "/BBS")
public class BoardController {
	
	@Inject
//	@Autowired
//	요리된 DAO를 컨트롤러에 주입하자!
	private BoardService bs;
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
//		정적파일 위치를 ${cp}로 맵핑해줌.
		return request.getContextPath();
	}
	
//	게시글 목록
	@RequestMapping(value = "/list.do", method=RequestMethod.GET)
	public String list(Locale locale, Model model) throws Exception {
		List list =  bs.list();
		model.addAttribute("list", list);
		model.addAttribute("dev", "개발자 빵부장");
		return "board/list";
	}
	
	@RequestMapping(value = "/writeView.do", method = RequestMethod.GET)
	public String regiView(Locale locale, Model model) throws Exception {
		return "/board/writeView";
	}
	
	@ResponseBody
	@RequestMapping(value = "/writeView", method = RequestMethod.POST)
	public  String regi(Locale locale, Model model, HttpServletRequest request) throws Exception {
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss"); 
		
		BoardDTO dto = new BoardDTO();
		dto.setName(request.getParameter("name"));
		dto.setContent(request.getParameter("content"));
		dto.setSubject(request.getParameter("subject"));
		dto.setReg_date(format.format(date));
		
		if(bs.regi(dto) == 1) {
			return "Y";
		}else {
			return "N";
		}
	}
	
}
