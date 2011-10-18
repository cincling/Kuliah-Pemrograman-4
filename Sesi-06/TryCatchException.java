import java.io.*;

public class TryCatchException {
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		try {
			coba();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void coba() throws Exception {
		//try {
			System.out.println("Choose one of the options,(1-3) " + "\n\t1.) Steak" + "\n\t2.) Lobster" + "\n\t3.) Cheeseburger");
			System.out.print("Masukan Pilihan Anda : ");
			String choose = input.readLine();
			if(choose.equals("1")){
				System.out.println("Anda memilih Steak :-)");
			} else if(choose.equals("2")){
				System.out.println("Anda memilih Lobster :-D");
			} else if(choose.equals("3")){
				System.out.println("Anda memilih Cheeseburger ;-)");
			} else {
				throw new Exception("pilihan anda tidak ada !"); //message sebagai exception
				//System.out.println("pilihan anda tidak ada !"); //message sebagai system out println biasa
			}
		//} catch (Exception e) {
		//	System.out.println(e.getMessage());
		//}

	}
}