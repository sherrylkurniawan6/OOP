//KELOMPOK 10
//
//Anggota : 
//	- Sherryl kurniawan (2540119570)
//	- Gisela Elviany (2501972120)
//	- Dira Abiyyu (2502027301)
//	- Wicakra Hanly (2502032964)

package LEC;

public class TugasSesi1 {

	public static void main(String[] args) {
		
		// no 1.1
		System.out.println(" ");
		System.out.println("Soal no 1.1");
		System.out.println("Welcome to Java, Welcome to Computer Science, and Programming is fun");
		
		// no 1.2
		System.out.println(" ");
		System.out.println("Soal no 1.2");
		for (int i = 1; i < 6; i++) {
			System.out.println("Welcome to Java");
		}
		
		// no 1.3
		System.out.println(" ");
		System.out.println("Soal no 1.3");
		System.out.println("    J     A     V     V       A   ");
		System.out.println("    J    A A     V   V       A A  ");
		System.out.println("J   J   AAAAA     V V       AAAAA ");
		System.out.println(" J J   A     A     V       A     A");
		
		// no 1.4
		System.out.println(" ");
		System.out.println("Soal no 1.4");
		System.out.println(" a   a^2   a^3");
		System.out.println(" 1   1     1  ");
		System.out.println(" 2   4     8  ");
		System.out.println(" 3   9     27 ");
		System.out.println(" 4   16    64 ");
		
		// no 1.5
		System.out.println(" ");
		System.out.println("Soal no 1.5");
		double pertama = 9.5*4.5; 
		double kedua = 2.5*3; 
		double total = pertama - kedua;
		
		System.out.println(" 9.5 X 4.5 - 2.5 X 3 ");
		System.out.println(" ------------------- = " + (total/42));
		System.out.println("       45.5 - 3.5    ");
		
		// no 1.6
		System.out.println(" ");
		System.out.println("Soal no 1.6");
		int total1 = 1+2+3+4+5+6+7+8+9;
		System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + total1);
		
		// no 1.7
		System.out.println(" ");
		System.out.println("Soal no 1.7");
		double k = 1.0;
		int count = 1;
		double phi = 0.0;
		for(int i = 0; i < 7; i++) {
			if (count%2==1) {
				phi+=1/k;
			}else {
				phi-=1/k;
			}
			count = count + 1;
			k = k + 2;
			if(i==5) {
				System.out.println("4*(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)) = " + Math.ceil(4*phi));
			}
			if(i==6) {
				System.out.println("4*(1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+(1/13)) = " + Math.ceil(4*phi));
			}
		}
		
		// no 1.8
		System.out.println(" ");
		System.out.println("Soal no 1.8");
		double rad = 5.5;
		
		double perimeter = 2*rad*Math.PI;
		double area = rad*rad*Math.PI;
		
		System.out.println("Perimeter = " + Math.ceil(perimeter));
		System.out.println("Area = " + Math.ceil(area));
		
		// no 1.9
		System.out.println(" ");
		System.out.println("Soal no 1.9");
		double width = 4.5;
		double height = 7.9;
		
		double area1 = width*height;
		double perimeter1 = (width+height)*2;
		
		System.out.println("Area = " + Math.ceil(area1));
		System.out.println("Perimeter = " + Math.ceil(perimeter1));
		
		
		// no 1.10
		System.out.println(" ");
		System.out.println("Soal no 1.10");
		double jarak = 14/1.6;
		double waktu = (45.5*60/3600);
		double average = jarak/waktu;
		System.out.println("Average speed in miles = " + Math.ceil(average));
		
		
		// no 1.11
		System.out.println(" ");
		System.out.println("Soal no 1.11");
		double birth = 7.0;
		double death = 13.0;
		double immigrant = 45.0;
		double population = 312032486.0;
		double time = 365*24*3600;
		
		double birthrate = time/birth;
		double deathrate = time/death;
		double immigrantrate = time/immigrant;
		
		for(int i=1; i < 6; i++) {
			population = population + birthrate + immigrantrate - deathrate;
			
			System.out.println("Populasi Year "  + i + " = " + (int)population);
		}
		
		
	}

}
