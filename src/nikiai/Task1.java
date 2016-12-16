package nikiai;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of strings:- ");
    int num = sc.nextInt();
    List<String> strList = new LinkedList<String>();
    for(int i=1;i<=num;i++)
    {
      System.out.println("Please enter string: "+i);
      String temp = sc.next();
      strList.add(temp);
    }
    strList.sort((s1,s2) -> s1.length()-s2.length());
    System.out.println("List Sorted on basis of length:- ");
    for(int i=0;i<num;i++)
      System.out.print(strList.get(i)+" ");
    sc.close();
  }
}
