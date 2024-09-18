package star;
import java.util.Scanner;
public class Print_A {
	 public static void printA(int row,int col) {
		 for(int i=1;i<=row;i++) {
   		  for(int j=1;j<=col;j++) {
   			   if(i==1 || i ==((row/2)+1)) {
   				  System.out.print("*");
   			   }
   			   else if(j==1 || j==col) {
   				   System.out.print("*");  
   			   }
   				
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");
	 }
	 
	 public static void printB(int row,int col) {
		 for(int i=1;i<=row;i++) {
   		  for(int j=1;j<=col;j++) {
   			   if(i==1 || i ==((row/2)+1) || i== row ) {
   				  System.out.print("*");
   			   }
   			   else if(j==1 || j==col) {
   				   System.out.print("*");  
   			   }
   				
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");	 
	 }
	 
	 public static void printC(int row,int col) {
		 for(int i=1;i<=row;i++) {
   		  for(int j=1;j<=col;j++) {
   			   if(i==1 || i == row ) {
   				  System.out.print("*");
   			   }
   			   else if(j==1) {
   				   System.out.print("*");  
   			   }
   				
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");   	 
	 }
	  
	 public static void printD(int row,int col) {
		 for(int i=1;i<=row;i++) {
   		  for(int j=1;j<=col;j++) {
   			   if((i==1 && j<col) || (i==row && j < col )) {
   				  System.out.print("*");
   			   }
   			   else if((j==1 && i!=1) || (j==col && i!=row && i!=1)) {
   				   System.out.print("*");  
   			   }
   				
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");    	 
	 }
	 
	 public static void printE(int row,int col) {
		 for(int i=1;i<=row;i++) {
   		  for(int j=1;j<=col;j++) {
   			   if((i==1 || i==row) || (i==(row/2)+1 && j<col) ) {
   				  System.out.print("*");
   			   }
   			   else if(j==1) {
   				   System.out.print("*");  
   			   }
   				
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");   	 
	 }

	 public static void printF(int row,int col) {
		 for(int i=1;i<=row;i++) {
   		  for(int j=1;j<=col;j++) {
   			   if((i==1) || (i==(row/2)+1 && j<col) ) {
   				  System.out.print("*");
   			   }
   			   else if(j==1) {
   				   System.out.print("*");  
   			   }
   				
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");   	 
	 }
	 
	 public static void printG(int row,int col) {
		 for(int i=1;i<=row;i++) {
   		  for(int j=1;j<=col;j++) {
   			   if(i==1 || i==row) {
   				  System.out.print("*");
   			   }
   			   else if(i<(row/2)+1 && j==1) {
   				   System.out.print("*");  
   			   }
   			   else if(i==(row/2)+1 && j!=2) {
   				System.out.print("*");  
   			   }
   			   else if(i>(row/2)+1 && (j==1 || j==col) ) {
   				System.out.print("*");  
   			   }
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");    	 
	 }
	 
	 public static void printH(int row,int col) {
		 
		 for(int i=1;i<=row;i++) {
			 
   		  for(int j=1;j<=col;j++) {
   			    if(i == (row/2)+1) {
   				  System.out.print("*");
   			   }
   			   else if(j==1 || j==col) {
   				   System.out.print("*");  
   			   }
   			  
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");   	 
	 }
	 
 public static void printI(int row,int col) {
		 
		 for(int i=1;i<=row;i++) {
			 
   		  for(int j=1;j<=col;j++) {
   			    if(i == 1 || i== row) {
   				  System.out.print("*");
   			   }
   			   else if(j==(col/2)+1) {
   				   System.out.print("*");  
   			   }
   			  
   			   else {
   				   System.out.print(" ");
   			   }
   		  }
   		  System.out.println("");
   	  }
		 System.out.println("");    	 
	 }
 
 public static void printJ(int row,int col) {
	 
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i == 1 || i==row) {
				  System.out.print("*");
			   }
			   else if(j == col) {
				   System.out.print("*");  
			   }
			   else if(i>(row/2)+1 && j==1) {
				   System.out.print("*"); 
			   }
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");  	 
 }
 
public static void printK(int row,int col) {
	 int count = col;
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(j==1) {
				  System.out.print("*");
			   }
			   else if(i<=(row/2)+1 && j==count) {
				   System.out.print("*");
				   if(i == (row/2)+1) {
					   
					   continue;
				   }
				   count--;
			   }
			   else if(i>(row/2)+1 && j == i ) {
				   System.out.print("*");
				   
			   }
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println(""); 	 
 }

public static void printL(int row,int col) {
	 int count = col;
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(j==1) {
				  System.out.print("*");
			   }
			   else if(i==row) {
				   System.out.print("*");
				   
			   }
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");	 
}
public static void printM(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(j==1 || j==col) {
				  System.out.print("*");
			   }
			   else if(i==(row/2)+1 && j==(col/2)+1) {
				   System.out.print("*");
			   }
			   else if(i>1 && i<(row/2)+1 && i==2 && ( j==2 || j==4)) {
				   System.out.print("*");
			   }
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");	 
}
public static void printN(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(j==1 || j==col) {
				  System.out.print("*");
			   }
			   else if(i==j) {
				   System.out.print("*");
			   }
			  
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println(""); 
}

public static void printO(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if((i==1 || i==row) && (j>1 && j<col)) {
				  System.out.print("*");
			   }
			   else if((i!=1 && i!=row) && (j==1 || j==col)) {
				   System.out.print("*");
			   }
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println(""); 
}
public static void printP(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i==1 || i==(row/2)+1) {
				  System.out.print("*");
			   }
			   else if(i<(row/2)+1 && (j==1 || j==col)) {
				   System.out.print("*");
			   }
			   else if(j==1) {
				   System.out.print("*");
			   }
			    
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}
public static void printQ(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i==1 || i==row) {
				  System.out.print("*");
			   }
			   else if(j==1 || j==col) {
				   System.out.print("*");
			   }
			   else if(i==(row/2)+1 && j==(col/2)+1) {
				   System.out.print("*");
			   }
			   else if(i>(row/2)+1 && j==i) {
				   System.out.print("*");
			   }
			    
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 for(int i=1;i<=col+1;i++) {
		  if(i==col+1) {
			  System.out.print("*");
		  }
		  else {
			   System.out.print(" ");
		   }
	 }
	 System.out.println("");
}

public static void printR(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i==1 || i==(row/2)+1) {
				  System.out.print("*");
			   }
			   else if(i<(row/2)+1 && (j==1 || j==col)) {
				   System.out.print("*");
			   }
			   else if(i>(row/2)+1 && i==j) {
				   System.out.print("*");
			   }
			   else if(j==1) {
				   System.out.print("*");
			   }
			    
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}
public static void printS(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i==1 || i==row || i==(row/2)+1) {
				  System.out.print("*");
			   }
			   else if(i<(row/2)+1 && j==1) {
				   System.out.print("*");
			   }
			   else if(i>(row/2)+1 && j==col) {
				   System.out.print("*");
			   }
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}

public static void printT(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i==1) {
				  System.out.print("*");
			   }
			   else if(j==(col/2)+1) {
				   System.out.print("*");
			   }
			   else if(i<(row/2)+1 && (j==1 || j==col)) {
				   System.out.print("*");
			   }
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}

public static void printU(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i!=row && (j==1 || j==col)) {
				  System.out.print("*");
			   }
			   else if(i==row && j>1 && j<col ) {
				   System.out.print("*");
			   }
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}

public static void printV(int row,int col) {
	col = row*2-1;
	 for(int i=1;i<=row;i++) {
		  for(int j=1;j<=col;j++) {
			    if(j==i || j==col+1-i) {
				  System.out.print("*");
				 
			   }
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}

public static void printW(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(j==1 || j==col) {
				  System.out.print("*");
			   }
			   else if(i==(row/2)+1 && j==(col/2)+1) {
				   System.out.print("*");
			   }
			   else if(i>(row/2)+1 && (j==i || j==(i/2)) && i!=row) {
				   System.out.print("*");
			   }
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}

public static void printX(int row,int col) {
	
	for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(j==i || j==col+1-i) {
				  System.out.print("*");
			   }
//			   else if(j==(col/2)+1) {
//				   System.out.print("*");
//			   }
//			   else if(i<(row/2)+1 && (j==1 || j==col)) {
//				   System.out.print("*");
//			   }
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}
public static void printY(int row,int col) {

	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i<(row/2)+1 && (j==i || j==col+1-i)) {
				  System.out.print("*");
			   }
			   else if(i>=(row/2)+1 && j==(col/2)+1) {
				   System.out.print("*");
			   }
			   
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}
	 
public static void printZ(int row,int col) {
	
	 for(int i=1;i<=row;i++) {
		 
		  for(int j=1;j<=col;j++) {
			    if(i==1 || i==row) {
				  System.out.print("*");
			   }
			   else if(j==col+1-i) {
				   System.out.print("*");
			   }
			   
			   
			  
			   else {
				   System.out.print(" ");
			   }
		  }
		  System.out.println("");
	  }
	 System.out.println("");
}
     public static void main(String[] args) {
    	  int row = 5;
    	  int col = 5;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.print("Enter Your Name:");
    	  String userInput = sc.nextLine();
    	  String userName = userInput.toUpperCase();
    	  for(int i=0;i<userName.length();i++) {
    		  char c = userName.charAt(i);
    		  if(c==' ')
    			  continue;
    		  switch(c) {
    		  case 'A':
    			  printA(row,col);
    			  break;
    		  case 'B':
    			  printB(row,col);
    			  break;
    		  case 'C':
    			  printC(row,col);
    			  break;
    		  case 'D':
    			  printD(row,col);
    			  break;
    		  case 'E':
    			  printE(row,col);
    			  break;
    		  case 'F':
    			  printF(row,col);
    			  break;
    		  case 'G':
    			  printG(row,col);
    			  break;
    		  case 'H':
    			  printH(row,col);
    			  break;
    		  case 'I':
    			  printI(row,col);
    			  break;
    		  case 'J':
    			  printJ(row,col);
    			  break;
    		  case 'K':
    			  printK(row,col);
    			  break;
    		  case 'L':
    			  printL(row,col);
    			  break;
    		  case 'M':
    			  printM(row,col);
    			  break;
    		  case 'N':
    			  printN(row,col);
    			  break;
    		  case 'O':
    			  printO(row,col);
    			  break;
    		  case 'P':
    			  printP(row,col);
    			  break;
    		  case 'Q':
    			  printQ(row,col);
    			  break;
    		  case 'R':
    			  printR(row,col);
    			  break;
    		  case 'S':
    			  printS(row,col);
    			  break;
    		  case 'T':
    			  printT(row,col);
    			  break;
    		  case 'U':
    			  printU(row,col);
    			  break;
    		  case 'V':
    			  printV(row,col);
    			  break;
    		  case 'W':
    			  printW(row,col);
    			  break;
    		  case 'X':
    			  printX(row,col);
    			  break;
    		  case 'Y':
    			  printY(row,col);
    			  break;
    		  case 'Z':
    			  printZ(row,col);
    			  break;
    		  default:
                  System.out.println("Invalid name");
                  break;
    		  }
    		  
    		  
    	  }
    	 
     } 
}
