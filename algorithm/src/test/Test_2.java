package test;

import java.util.Scanner;

public class Test_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
               sb.append("*"); 
            }
            sb.append("\n");  
        }
        System.out.println(sb.toString());
	}
}