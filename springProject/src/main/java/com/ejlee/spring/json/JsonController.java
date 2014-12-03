package com.ejlee.spring.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
	
	@RequestMapping(value="/test.do", method=RequestMethod.GET)
	@ResponseBody
	public String jsonMake(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("aa", "aa_1");
		map.put("bb", "bb_1");
		map.put("cc", "cc_1");
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(map);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("a", 1);
		jsonObject.put("b", 1);
		jsonObject.put("c", jsonArray);
	
		
		String a = jsonObject.toString();
		System.out.println("a: "+a);
		return a;
	}
}
