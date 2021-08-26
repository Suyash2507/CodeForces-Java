import java.util.*;
class Randoms extends Thread{
    public synchronized void run() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N!");
        int n=sc.nextInt();
        int p1,p2,p3;
        int np1=0,np2=0,np3=0;
        int i;
        int max=0;
        int flag1=1;
        int flag2=2;
        int flag3=3;
        for(i=0;i<n;i++) {
            System.out.println("p1 turn : ");
            p1=sc.nextInt();
            System.out.println("p2 turn : ");
            p2=sc.nextInt();
            System.out.println("p3 turn : ");
            p3=sc.nextInt();
            System.out.println("********************************************");
            System.out.println("19bce1503");
            System.out.println("********************************************");

            One obj = new One(p1,p2,p3,max);
            obj.start();

            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(obj.flag1==1){
                max=p1;
                np1++;
            }
            if(obj.flag2==1){
                max=p2;
                np2++;
            }
            if(obj.flag3==1){
                max=p3;
                np3++;
            }

        }
        if(np1>=np2 && np1>=np3){
            System.out.println("p1 wins");
        }
        else if(np2>=np1 && np2>=np3){
            System.out.println("p2 wins");
        }
        else{
            System.out.println("p3 wins");
        }
    }
}
class One extends Thread{
    int p1,p2,p3;
    int max=0;
    int flag1=0;
    int flag2=0;
    int flag3=0;



    One(int a,int b,int c,int d){
        p1=a;
        p2=b;
        p3=c;
        max=d;

    }
    public synchronized void run() {
        if(p1>max){
            max=p1;
            flag1=1;
        }
        if(p2>max){
           max=p2;
            flag2=1;
        }
        if(p3>max){
            max=p3;
            flag3=1;

        }

    }
}

public class labbexam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Randoms r1 = new Randoms();
        r1.start();
    }
}