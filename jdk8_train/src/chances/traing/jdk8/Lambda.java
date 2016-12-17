package chances.traing.jdk8;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {
	static List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
   public  Comparator<String>   first(){
	   Comparator<String> comp = (f,s)->Integer.compare(f.length(), s.length());
	   return comp;
   }
   
   public  void   second(){
	   Collections.sort(names,first());
   }
   
   public static void closure(int  count ){
	   
   }
   
   public void filterDir(File dir){
   }
   
   public static void main(String[] args){
   }
}
