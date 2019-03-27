package kr.ac.inhatc.mvc.controlloer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.inhatc.mvc.service.JspService;

@RestController
public class HelloController {
	//http://localhost:8000/hello?num*=원하는 수 입력
	
	@Autowired
	JspService service; //자바에서 new 대신 스프링에서는 autowired 사용
	
	@RequestMapping("/hello") //맵핑주소:hello
	public String hello(String num) { //패러미터 num*으로 맞춰줌
		String str="";
			for(int i=1;i<10;i++) {
				str+=(num+"*"+i+"="+Integer.parseInt(num)*i+' ');
		}
			return str;
	}
	
	@RequestMapping("/count")
	public String count() {
		return ""+service.count();
	}
}
