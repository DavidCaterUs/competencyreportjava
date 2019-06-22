import java.util.Scanner;

public class Game{

public static void main(String args[])

  {
  Character mario=new Character("(M)",100,20,30);
  Character yoshi=new Character("(Y)",200,20,50);
  Scanner sc=new Scanner(System.in);
  Scanner sc1=new Scanner(System.in);
  Scanner sc2=new Scanner(System.in);

  System.out.println(" Select 1 for Mario or 2 for Yoshi...");
  System.out.println("Select an option: ");
int op=sc.nextInt();

switch(op){//Conditional for Selection
  case 1:;
  mario.printing();
  System.out.println("Attack Times: ");
  int x=sc1.nextInt();
  for(int i=0;i<x;i++)// makes a look repeat the instruction
  {
    mario.attack(yoshi);
  }
  break;
    case 2:;
    yoshi.printing();
    System.out.println("Attack Times: ");
    int y=sc2.nextInt();
    for(int i=0;i<y;i++)
    {
      yoshi.attack(mario);
    }
    break;
}




  }


}
