import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int a, b, toplam = 0; int count=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        a = inp.nextInt();
        System.out.print("n2 sayisini giriniz : ");
        b = inp.nextInt();
        if(a>b){
            while (a >= count) {
                count++;
                if (a % count == 0 && b % count == 0) {
                    toplam = count;
                }
            }
        }else {
            while (b >= count) {
                count++;
                if (a % count == 0 && b % count == 0) {
                    toplam = count;
                }
            }
        }
            System.out.println("Sayilarin ebobu : " + toplam);
            System.out.println("Sayilarin ekoku : " + (a*b)/toplam);







    }
}

