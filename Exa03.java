public class Exa03{ 
	public static void main(String[] args) {
		int num[][] = {{-1,7,0,17},{12,-3,8,6},{2,9,3,-4},{15,6,1,0}};
			System.out.println("la suma es"+suma(num));
	
	}
	public static int suma(int num[][]){
		int suma = 0;
			for (int i=0;i<	num.length ;i++ ) {
				suma = suma + num[i][i]; 
			}
			return suma;
	}

}
