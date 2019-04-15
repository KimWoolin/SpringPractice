package kr.ac.inhatc.mvc.controlloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.mvc.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@RequestMapping("selectSubjectList")
	public ModelAndView selectSubjectList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.addObject("subjectList",boardService.selectSubjectList());
		mv.setViewName("board2");
		return mv;
	}
}
