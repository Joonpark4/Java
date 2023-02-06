
public class TunaSet{
	int 일반;
	int 야채;
	int 고추;

	TunaSet(int x, int y, int z){
	  this.일반 = x;
	  this.야채 = y;
	  this.고추 = z;
	}
	class Special extends TunaSet{
		int 햄;
		int 카놀라유;
		
		Special(int x, int a, int b){
			super(x, 0, 0);
			this.햄 = 햄;
			this.카놀라유 = 카놀라유;
			
		}
	}
	void output(String Spe1) {
		super.output(Spe1);
		System.out.println("햄 :" + 햄);
	}


	 public static void main(String[] args) {
		TunaSet cham3 = new TunaSet(12,3,3);
		System.out.println(cham3.일반);
	 }
}
