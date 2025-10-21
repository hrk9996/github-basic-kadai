package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	
	
	//自分のじゃんけんの手を入力する
	public String getMyCohice(){
		while(true) {
			 System.out.println("自分のじゃんけんの手を入力しましょう");
			 System.out.println("グーはrockのrを入力しましょう");
			 System.out.println("チョキはscissorsのsを入力しましょう");
			 System.out.println("パーはpaperのpを入力しましょう");
			 
			  Scanner scanner = new Scanner(System.in);
			  
			  String input= scanner.next();
			 			  			 
			  System.out.println(input);
			  
			  if(input.equals("r") || input.equals("s") || input.equals("p")) {
				  scanner.close();
				  return input;
				 
				  
			  }else {
				 System.out.println("正しい値を入力してください");
			  }
			  
			  
			  
		}
		
		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom(){
		
		String[] jyanken = {"r", "s", "p"};
		
		int vsChoice =(int) (Math.floor( Math.random() * 3 ));
		
		String choice = jyanken[vsChoice];
		
		//実行するクラスに対戦相手のじゃんけんの手を返す
		return choice;
	
			
		}
		
		
		
		
	
	
	//じゃんけんを行う
	public void playGame(String mychoice, String yourchoice){
		
		HashMap<String, String> jyankenMap = new HashMap<String, String>();
		
			jyankenMap.put("r","グー");
			jyankenMap.put("s","チョキ");
			jyankenMap.put("p","パー");
			
		
		
		System.out.println("自分の手は" + jyankenMap.get(mychoice) + "対戦相手の手は" + jyankenMap.get(yourchoice));
		
		if(mychoice.equals(yourchoice)) {
			System.out.println("あいこです");
		}else if(mychoice.equals("r") && yourchoice.equals("s") ) {
			System.out.println("自分の勝ちです");
		}else if(mychoice.equals("r") && yourchoice.equals("p")){
			System.out.println("自分の負けです");
		}else if(mychoice.equals("s") && yourchoice.equals("r")) {
			System.out.println("自分の負けです");
		}else if(mychoice.equals("s") && yourchoice.equals("p")){
			System.out.println("自分の勝ちです");
		}else if(mychoice.equals("p") && yourchoice.equals("r")){
			System.out.println("自分の勝ちです");
		}else if(mychoice.equals("p") && yourchoice.equals("s")){
			System.out.println("自分の負けです");
		}
	}
		
	
	
  }

