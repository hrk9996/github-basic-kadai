package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	
	
	
	HashMap<String, String> fruitMap = new HashMap<String, String>();
	
	public Dictionary_Chapter21(){
	
	fruitMap.put("apple","りんご");
	fruitMap.put("peach","桃");
	fruitMap.put("banana","バナナ");
	fruitMap.put("lemon","レモン");
	fruitMap.put("pear","梨");
	fruitMap.put("kiwi","キウィ");
	fruitMap.put("strawberry","いちご");
	fruitMap.put("grape","ぶどう");
	fruitMap.put("muscat","マスカット");
	fruitMap.put("cherry","さくらんぼ");
	
	}
	
	public void search(String[] fruits){
	
	for(int i = 0; i < fruits.length; i++) {
		if(fruitMap.get(fruits[i]) == null){
			System.out.println(fruits[i] + "は辞書に存在しません");

		}else {
			System.out.println(fruits[i] + "の意味は" + fruitMap.get(fruits[i]));
		}
	}
	
	}
	
	

}
	






