package devLabo;

public class MakeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		String empty = " ";
		String emptyZenkaku = "　";
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(empty + num);
				num = num + 1;
			}
			System.out.println();
		}
		
		empty = "abcd";
		System.out.println(empty.substring(3));
		
	}

}
