package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/result")
    @ResponseBody
    public String result(@RequestParam(name = "num1") int num1, @RequestParam(name="num2") int num2, @RequestParam(name="op") String op) {

    	float res = 0;
    	boolean test = true;
    	if(op.compareTo("+")==0)
    	{
    		res=num1+num2;
    	}
    	else if(op.compareTo("-")==0)
    	{
    		res=num1-num2;
    	}
    	else if(op.compareTo("*")==0)
    	{
    		res=num1*num2;
    	}
    	else
    	{
    		if(num2!=0) 
    		{
    			res = (((float)num1) / ((float)num2)); 
    		}
    		else
    		{
    			test=false;
    		}
    	}
    	
    	if (test==false)
    		return "Error :  Divide by zero";
        
    	return "Result : \n " + num1 + op + num2 + " = " + res;
    }

}
