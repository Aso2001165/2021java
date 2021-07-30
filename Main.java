package senkan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ship sh=new ship();
        
        sh.a0();
        sh.b1();
        sh.c2();
        while(true){
            System.out.printf("***********\n   戦艦ゲーム     \n***********\n");
            sh.hp();
            
            System.out.println("爆弾のX座標を入力してください（０－４）");
            int xx=sc.nextInt();
            System.out.println("爆弾のX座標を入力してください（０－４）");
            int yy=sc.nextInt();
            
            sh.hunt(xx,yy);
            if(sh.shiphp[0]==0 && sh.shiphp[1]==0 && sh.shiphp[2]==0){
                System.out.println("全艦撃沈");
                break;
            }
        }
        sc.close();
    }
    
}