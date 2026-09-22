import java.util.*;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int roll=sc.nextInt();
      sc.nextLine();
      String name=sc.nextLine();
      double java=sc.nextDouble();
      double DBMS=sc.nextDouble();
      double Maths=sc.nextDouble();
      double tot,avg;
      tot=java+DBMS+Maths;
      avg=(tot/3);
      System.out.print(roll+" "+name+" "+java+" "+DBMS+" "+Maths+" "+tot+" "+avg);
    }
}