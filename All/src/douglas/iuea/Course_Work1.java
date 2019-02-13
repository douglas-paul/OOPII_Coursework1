package douglas.iuea;

import java.util.Scanner;

public class Course_Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
      
        int score;
        String regno;
        int n=50;/*number of students*/
        int q=6;/*number of course units*/
        
        for(int i=0;i<n;i++) {
        	System.out.println("Enter your Regno.: ");
        	regno=scn.next();
        	
        	for(int k=0;k<q;k++) {
        	System.out.print("Enter your score: ");
        	score=scn.nextInt();
        	
        	if(score >=80 && score <=100) {
        		
        		System.out.println("REGNO. is: "+regno +  " Score is A and GPA=5.0");
        	}
        	else if(score>=75 && score<=79) {
        		System.out.println("REGNO. is: "+regno +  " Score is B+ and GPA=4.5");
        	}
        	else if(score>=70 && score<=74) {
        		System.out.println("REGNO. is: "+regno +  " Score is B and GPA=4.0");
        	}
        	else if(score>=65 && score<=69) {
        		System.out.println("REGNO. is: "+regno +  " Score is C+ and GPA=3.5");
        	}
        	else if(score>=60 && score<=64) {
        		System.out.println("REGNO. is: "+regno +  " Score is C and GPA=3.0");
        	}
        	else if(score>=55 && score<=59) {
        		System.out.println("REGNO. is: "+regno +  " Score is D+ and GPA=2.5");
        	}
        	else if(score>=50 && score<=54) {
        		System.out.println("REGNO. is: "+regno +  " Score is D and GPA=2.0");
        	}
        	else {
        		System.out.println("REGNO. is: "+regno +  " Score is F and GPA=0.0 ");
        	}
          }
        }
	  }
   }