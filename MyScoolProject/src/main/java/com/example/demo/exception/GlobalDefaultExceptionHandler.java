//package com.example.demo.exception;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.NoHandlerFoundException;
//
//@ControllerAdvice
//public class GlobalDefaultExceptionHandler {
//
//	@ModelAttribute
//	@ExceptionHandler(NoHandlerFoundException.class)
//	public String handleNoHandlerFoundException(Model model) {
//
//		
//		model.addAttribute("errorTitle", "The page is not constructed");
//		model.addAttribute("errorDescription", "The page you are looking for is not available now! ");
//		model.addAttribute("title", "404 error page");
//
//		return "error";
//		
//	}
//	
//
////	@ExceptionHandler(Exception.class)
////	public String handleException(Exception exc, Model model) {
////		
////		StringWriter sw = new StringWriter();
////		PrintWriter pw = new PrintWriter(sw);
////		
////		exc.printStackTrace(pw);
////		
////		model.addAttribute("errorTitle", "Contact your Administrator!");
////		model.addAttribute("errorDescription", sw.toString());
////		model.addAttribute("title", "Error");
////		
////		;
////		
////		return "404";
////		
////	}
//	
//
//	
//}
