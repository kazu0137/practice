import java.util.Scanner; 
public class Main{ 
public static void main(String[]args) { 
Scanner scanner = new Scanner(System.in); 
String name[] = {"グー","チョキ","パー"}; 
System.out.println("じゃんけんゲーム"); 
for( ; ; ){ 
try { 
System.out.println("プレイヤー1の手を0～2の数字で入力してください"); 
System.out.println("グー:0 チョキ:1 パー:2"); 
int p1 = scanner.nextInt(); 
System.out.println("プレイヤー2の手を0～2の数字で入力してください"); 
System.out.println("グー:0 チョキ:1 パー:2"); 
int p2 = scanner.nextInt(); 
System.out.println("プレイヤー1:" + name[p1] + " VS プレイヤー2:" + 
name[p2]); 
if (p1 == p2){ 
    System.out.println("あいこです"); 
}else if ((p2 + 3 - p1) % 3 == 1){ 
    System.out.println("プレイヤー1の勝利です"); 
    break; 
}else{ 
    System.out.println("プレイヤー2の勝利です"); 
    break; 
} 
} 
catch(ArrayIndexOutOfBoundsException e){ 
      System.out.println("正しい数値を入力してください"); 
} 
} 
} 
} 

