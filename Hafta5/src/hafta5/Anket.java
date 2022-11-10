package hafta5;

import java.util.Arrays;
import java.util.Scanner;

public class Anket {

	public static void main(String[] args) {
		int a=0,b=0,c=0,d=0,e=0;
		Scanner input=new Scanner(System.in);
		int kntrl=1;
		int kisisayisi=0;
		int [][] cevap= new int [5][10];
		
		while(kntrl==1) {
			kisisayisi++;
			int puan=0;
			System.out.println("Asagidaki sorulara onemine gore 1-10 arasi puan veriniz:  ");
			System.out.println("ekonomi sizin icin ne kadar onemli");
			a=input.nextInt();
			cevap[0][a-1]++;
			System.out.println("hayvan haklari sizin icin ne kadar onemli");
			b=input.nextInt();
			cevap[1][b-1]++;
			System.out.println("kuresel isinma sizin icin ne kadar onemli");
			c=input.nextInt();
			cevap[2][c-1]++;
			System.out.println("siyaset sizin icin ne kadar onemli");
			d=input.nextInt();
			cevap[3][d-1]++;
			System.out.println("kadin haklari sizin icin ne kadar onemli");
			e=input.nextInt();
			cevap[3][e-1]++;
			System.out.println("teste tekrar girmek icin 1'e cikmka istiyorsaniz 2'e basiniz");
			kntrl=input.nextInt();
			
			 for(int i=0;i<5;i++) {
				 
				 for(int j=0;j<10;j++) {
					 System.out.println(cevap[i][j]+" ");
					 
				 }
				 System.out.println("\n" );
			 }
			System.out.println("");
			
		}
		double[] toplam=new double[5];
		for(int m=0;m<5;m++) {
			for(int n=0;n<10;n++) {
				toplam[m]+=(n+1)*cevap[m][n];
			}
		}
		for(double sayilar:toplam) {
			double ortalama=sayilar/kisisayisi;
			System.out.println(ortalama);
		}

	}

}
