import java.util.*;

class main{
      public static String Lowercase(String st){
	   String str = st.toLowerCase();
	   return str;
	}
      public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  //String s = sc.nextLine();
	  String l = Lowercase("VEN");
	  System.out.println(l);
	}
}