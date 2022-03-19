package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimeController {
@RequestMapping("/prime")
public String prime()
{
	return "primenumber";
}
@RequestMapping("/primelogic")
public ModelAndView primelogic(HttpServletRequest request,HttpServletResponse response) 
{
	int num=Integer.parseInt(request.getParameter("txtnum"));
	int i=1,count=0;
	while(i<=num)
	{
		if(num%i==0)
		{
			count++;
		}
		i++;
	}
	if(count==2)
	{
		return new ModelAndView("primenumber","key","prime");
	}
	else
	{
		
		return new ModelAndView("primenumber","key","not prime");
	}
	
}
}
