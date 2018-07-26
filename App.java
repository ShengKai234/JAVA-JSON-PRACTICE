package org.iii.test;

/**
 * Hello world!
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.*;

public class App {
	public static void main(String[] args) throws JSONException {

//**************************JSON****************************************
		//class取得資料（物件）
		Profile kai = new Profile("kai", 25, "taipei");
		Profile kam = new Profile("kam", 34, "American");
		//將class轉成json型別-1
		JSONObject json_kai = new JSONObject();
		json_kai.put("name", kai.getName());
		json_kai.put("age", kai.getAge());
		json_kai.put("live", kai.getLive());
		System.out.println(json_kai.toString());
		//將class轉成json型別-2
		JSONObject json_kam = new JSONObject();
		json_kam.put("name", kam.getName());
		json_kam.put("age", kam.getAge());
		json_kam.put("live", kam.getLive());
		System.out.println(json_kam.toString());
		
		//~~~~建立json_kai的孩子(json型別)，json中塞入json~~~~~~
		JSONObject json2 = new JSONObject();
		json2.put("name", "kaka");
		json2.put("age", 5);
		json2.put("live", "taipei");
		json_kai.put("child", json2);
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//建立json array，並且put先前得的到的json
		JSONArray profile_arr = new JSONArray();
		profile_arr.put(json_kai);
		profile_arr.put(json_kam);
		
		//批次印出array資料
		for (int i = 0; i < profile_arr.length(); i++)
		{
			//先宣告json obj，並批次取得profile_arr的obj，然後印出
			JSONObject j_obj = profile_arr.getJSONObject(i);
			System.out.println("------>"+j_obj.toString());
		}
		
		//只印出json_kai的child
		System.out.println("kai's child------>"+json_kai.getJSONObject("child"));

	}

}
