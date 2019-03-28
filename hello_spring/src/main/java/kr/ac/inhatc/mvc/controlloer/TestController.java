package kr.ac.inhatc.mvc.controlloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.mvc.service.JspService;

@RestController
//레스트 컨트롤러로 선언
public class TestController {
	@Autowired
	JspService service;
	//뉴가 아니라 오토와일드로 관리됨
	
	//http://localhost8000/count2 >> count값에서 이어짐
	@RequestMapping("/count2")
	public String count2() {
		return ""+service.count();
	}
	

	//http://localhost:8000/boardMv
	@RequestMapping("/boardMv") 
	public ModelAndView boardMv(Model model, int n) {
		model.addAttribute("rowcnt",n);
		ModelAndView mv = new ModelAndView();
		mv.addObject("count",service.count());//jsp에서 불러올 어트리뷰트네임,
		mv.setViewName("board");//어떤 뷰에 뿌려줄 것인가
		return mv; //보드에 데이터 전달 > 보드에서 데이터 출력 어떻게? > board로 넘어가서 설정
	}
	
	
}