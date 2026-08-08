import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int res=0;
        while(n>0){
            res+=n;
            n--;
        }
        System.out.print(res);
    }
}