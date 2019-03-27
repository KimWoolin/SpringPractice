package kr.ac.inhatc.mvc.controlloer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
}


