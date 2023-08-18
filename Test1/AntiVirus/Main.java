package Test1.Antivirus;

public class Main {

	public static void main(String[] args) {
		AntiVirus a=new AntiVirus();
		Transaction t=new Transaction();
		//t.checkTransaction();
		a=new AntiVirus("KEY139710");
		a.statusOfAntiVirus(t);
	}
}
