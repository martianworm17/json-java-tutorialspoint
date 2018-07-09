package com.gowpar.json.java;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonEncodeDemo {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));

		JSONArray obj_arr = new JSONArray();
		obj_arr.add("Par");
		obj_arr.add("Talon");
		obj_arr.add("Una");
		
		obj.put("jones", obj_arr);
		
		System.out.println(obj);
	}

}
