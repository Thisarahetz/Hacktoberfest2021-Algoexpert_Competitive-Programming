
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=20;
		int reminder = N % 2;
	       
	     if(N<=5){
	           if(reminder==0){
	               System.out.println("Not Weired");
	           }
	           else{
	               System.out.println("Weird");
	           }
	       }else if(N<20){
	           if(reminder==0){
	               System.out.println("Weired");
	           }else{
	               System.out.println("Weird");
	           }
	       }else   if(N>=20){
	           if(reminder==0){
	               System.out.println("Not Weired");
	           }
	           else{
	               System.out.println("Weirdsds");
	           }
	       }
	        

	}

}
