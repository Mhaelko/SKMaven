package HW.Lesson02;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую разрядность:");
        int first = sc.nextInt();
        System.out.println("Введите вторую разрядность:");
        int second = sc.nextInt();
        int r = first+second;
        int maxis = (int)Math.pow(10, first)-1;
        int minis = (int) Math.pow(10, second)-1;
        int m=0, t=0;
        for (int i = maxis; i > 0; i--) {
            for (int j = minis; j>0; j--) {
                String s = "90901";//String.valueOf(maxis * minis);
                int l = s.length();
                while(l>=m)
                {
                   char test1 = s.charAt(m);
                   char test2 = s.charAt(l-1);
                   if(test1==test2)
                       t+=2;
                       //System.out.println("Работает");
                   m++;
                   l--;
                   if(t>=l){
                       System.out.println(s);
                       System.exit(0);
                   }
                }
                /* while (r >= 1) {
                 int k = 0;
                char t1='0',t2='0';
                while(k!=l)
                    t1= pali.charAt(k);
                    t2 =  pali.charAt(l-1);
                    if(t1 == t2){
                        k++;
                        l--;
                    }
                    else break;
                System.out.println(pali);

                    int t=1;
                    int t1 = (int) (m/Math.pow(10, r-1));
                    int t2 = (int) (m%Math.pow(10, t));
                    if( t1==t2 ){
                        m/=10;
                        m %= Math.pow(10, r-2);
                        r-=2;
                        t++;
                    }
                    else
                        break;
                    System.out.println(i*j);
                }
                //System.out.println(i*j);*/
            }
        }


    }
}
