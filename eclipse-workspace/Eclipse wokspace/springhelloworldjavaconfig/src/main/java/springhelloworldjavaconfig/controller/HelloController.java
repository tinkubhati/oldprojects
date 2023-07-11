package springhelloworldjavaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

		@RequestMapping("/hello")
		public ModelAndView greet(@RequestParam("name") String name) { 
		ModelAndView mv = new ModelAndView();
		
		//Give name of JSP page OR View
		mv.setViewName("hello");
		
		//Data that you want to show on view
		mv.addObject("name", name);
		
		return mv;
		

	}
}
