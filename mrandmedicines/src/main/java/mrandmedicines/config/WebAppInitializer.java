package mrandmedicines.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
Representative Webservices: 
	 * Create representative--->http://localhost:8080/mrandmedicines/representative
	 * Edit representative --->http://localhost:8080/mrandmedicines/representative/2
	 * Delete representative --->http://localhost:8080/mrandmedicines/representative/1
	 * Get information of an representative by its ID --->http://localhost:8080/mrandmedicines/representative/8
	 * Get List of all representatives --->http://localhost:8080/mrandmedicines/representative
	 */ 
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[] { AppConfig.class };
   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] { WebConfig.class };
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }
}
