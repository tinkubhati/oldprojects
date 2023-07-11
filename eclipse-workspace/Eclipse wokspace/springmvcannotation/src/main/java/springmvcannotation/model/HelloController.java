package springmvcannotation.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	//http:localhost:8080/springmvcannotation/hello.htm
	@RequestMapping("/hello.htm")
	public ModelAndView greet() {
		
		ModelAndView mv = new ModelAndView();
		
		//Give name of JSP page OR View
		mv.setViewName("welcome");
		
		//Data that you want to show on view
		mv.addObject("name", "Tinku Bhati");
		
		return mv;
	}
	
	@RequestMapping("/helloparam.htm")
	public ModelAndView greet(@RequestParam("name") String name) {
		
		ModelAndView mv = new ModelAndView();
		
		//name of JSP page or view
		mv.setViewName("welcome");
		
		//data that you want to show on view
		mv.addObject("name", name);
		
	
		return mv;
	}
	//http:localhost:8080/springmvcannotation/helloparam2.htm?name="Pandey"
	@RequestMapping("/helloparam2.htm")
	public ModelAndView greeting(@RequestParam("name") String name, @RequestParam("age") int age) {
		
		ModelAndView mv = new ModelAndView();
		
		//name of JSP page or view
		mv.setViewName("hello");
		
		//data that you want to show on view
		mv.addObject("name", name);
		mv.addObject("age", age);
		return mv;
		
		
	}
	
	@RequestMapping(value="/hellomessage/{message}")
    public ModelAndView getMessage(@PathVariable("message")String message) {
        ModelAndView mv = new ModelAndView();



       // Give name of JSP page OR View
        mv.setViewName("welcomewithvariable");

       // Data that you want to show on view
        mv.addObject("message", message);


       return mv;
        
    }
	
	
	//http:localhost:8080/springmvcannotation/hellostring.htm
	@RequestMapping("/hellostring.htm")
	public String greetings() {
		return "hello";
	}

}
