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

		// 成員宣告及初始化
		Player car = new Player();
		// Vechicle成員的類別函式呼叫
		car.setBlood(6.0);
		System.out.println(car.show_blood());

		// 成員宣告及初始化
		Player car2 = new Player();
		// Vechicle成員的類別函式呼叫
		System.out.println(car2.red_Car.TrafficBlood());

		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("pinapple");

		for (String eachFruit : fruit) {
			System.out.println(eachFruit);
		}

		String desired = "Coconut";
		fruit.set(2, desired);

		for (int eachFru = 0; eachFru < fruit.size(); eachFru++) {
			System.out.println(fruit.get(eachFru));
		}

		// 宣告HashMap
		HashMap<Integer, String> fruitMap = new HashMap<Integer, String>();

		// 添加鍵值key, value，如果存在key則覆蓋value
		fruitMap.put(1, "apple");
		fruitMap.put(2, "banana");
		fruitMap.put(3, "pinapple");

		// putIfAbsent使用
		fruitMap.putIfAbsent(4, "graph");
		fruitMap.putIfAbsent(4, "none");

		// 刪除
		fruitMap.remove(3);

		// 元素替換，不存在時則不會有任何動作
		fruitMap.replace(3, "pinapple");
		fruitMap.replace(1, "pinapple");

		// 取得key值value
		System.out.println(fruitMap.get(4));

		// 判斷key、value是否存在
		String fruit123 = fruitMap.containsKey(3) ? fruitMap.get(3) : "nothing";
		System.out.println(fruit123);

		// getOrDefault使用
		fruit123 = fruitMap.getOrDefault(3, "defaltValue");
		System.out.println(fruit123);

		for (Entry<Integer, String> enter : fruitMap.entrySet()) {
			System.out.println(enter.getKey() + " = " + enter.getValue());
		}

		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("123");
		nameList.add("456");
		nameList.add("789");

		for (String name : nameList)
			System.out.println(name);
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
		
		
//		String name = json.getString("name");
//		int age = json.getInt("age");
//		String live = json.getString("live");
//
//		JSONArray array = new JSONArray();
//		array.put(json);
//		array.put(json);
//		array.put(json);
//
//		System.out.println(array.toString());
//
//		for (int i = 0; i < array.length(); i++) {
//			JSONObject j = array.getJSONObject(i);
//			System.out.println(">>>>> "+j.toString());
//		}
//
//		JSONObject json2 = new JSONObject();
//		json2.put("name", "lucas");
//		json2.put("age", 28);
//		json2.put("live", "Taipei");
//		
//		json.put("child", json2);
//		System.out.println("~~ "+json.toString());
//		System.out.println("~~ "+json.getJSONObject("child").toString());

	}

}
