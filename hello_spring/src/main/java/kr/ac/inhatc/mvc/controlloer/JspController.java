package kr.ac.inhatc.mvc.controlloer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.mvc.dto.BoardDto;
@Controller
public class JspController {
	@RequestMapping("/jsp")
	public String jsp() {
		return "hello";
	}
	
	
	@RequestMapping("/gugudan")
	   public String gugudan(Model model,@RequestParam(value="n",required=false, defaultValue="5") int num) {
		   String str="";
	           for(int i=1;i<10;i++) {
			str+=num+"*"+i+"="+num*i+' ';
			}

		      model.addAttribute("result", str);
		      return "gugudan"; 
		   }
	
	@RequestMapping("/el")
	public ModelAndView el() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("el");
		BoardDto bt = new BoardDto();
		bt.setId("inhatc");
		bt.setName("서버프로그래밍");
		bt.setRegUser("java");
		bt.setUseYn("Y");
		bt.setDescription("스프링 프레임워크");
		bt.setNo(10);
		mv.addObject("boardDto",bt);
		return mv;
	}
		/*
		@RequestMapping("/jstl")
		public ModelAndView jstl() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("jstl");
			BoardDto bt = new BoardDto();
			bt.setId("inhatc");
			bt.setName("서버프로그래밍");
			bt.setRegUser("java");
			bt.setUseYn("Y");
			bt.setDescription("스프링 프레임워크");
			bt.setNo(10);
			mv.addObject("boardDto",bt);
			mv.addObject("cnt",5);
			return mv;
		*/

		@RequestMapping("/jstl")
		public ModelAndView jstl(BoardDto boardDto) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("jstl");
			mv.addObject("boardDto",boardDto);
			mv.addObject("cnt",5);
			return mv;
	}
		
}


