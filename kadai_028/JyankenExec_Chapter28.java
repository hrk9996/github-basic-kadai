package kadai_028;


public class JyankenExec_Chapter28 {
	public static void main(String[] args){
		
		
		Jyanken_Chapter28 game = new Jyanken_Chapter28();
	
		
		
		String me = game.getMyCohice();
		
		String you = game.getRandom();
		
		game.playGame(me, you);
		
		
		
	}

}
