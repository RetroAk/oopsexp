import java.util.*;
class pall_str{
        public static void main(String[] args){
                Scanner aa=new Scanner(System.in);
                System.out.print("enter anything: ");
                String a=aa.next();
                String b=a;
                String c="";
                int l=a.length();
                for(int i=l-1;i>=0;i--){
                        c=c+a.charAt(i);}
                if(c.equals(b)){System.out.println(a+" is a pallindrome");}
                else{System.out.println(a+" is not pallindrome");}
        }
}
