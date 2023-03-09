package coffee.production.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cofee.production.entity.Coffee;

@RestController
public class CoffeeController 
{	
	List<Coffee> beans=new ArrayList<Coffee>();
	
	//Adding values
	
	public CoffeeController()
	{
		beans.addAll(List.of
				(new Coffee("Normal Coffee",99.80),
				new Coffee("Flat White",150.00),
				new Coffee("Latte",170.00),
				new Coffee("Americano",350.00),
				new Coffee("Ice Coffee",110.00)
				
)
);
	}
	@RequestMapping("/beans")
	List<Coffee> getAllLeds()
	{
			return beans;	
	}
}
