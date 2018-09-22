import java.io.*;
import java.util.*;
  public class Last{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String str=sc.nextLine();
      for(int i=str.length()-1;i>0;i--)
      {
        if(i==str.length()-1)
        {
          System.out.println(str.charAt(i));
        }
      }
    }
  }  
