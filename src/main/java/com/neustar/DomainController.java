package com.neustar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DomainController {
	@RequestMapping("/domains")
	public List<Model> getDomainData() {
		//here make a db call to fetch details
		List<Model> modelList=new ArrayList<>();
		modelList.add(new Model("Premium","apple.com.au",1000));
		modelList.add(new Model("Premium","dict.com",800));
		modelList.add(new Model("Premium","education.net",300));
		modelList.add(new Model("Zone",".com",10));
		modelList.add(new Model("Zone",".com.au",9));
		modelList.add(new Model("Zone",".net",20));
		
		return modelList;
	}

}
