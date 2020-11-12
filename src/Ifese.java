import java.util.Scanner;

public class Ifese {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // scan ishlatgand doim  ozgaruvchidan keeyin hextInt buurig'i beriladi!
        System.out.println("samething wraite");
        int Oli=scan.nextInt();
       // System.out.println(Oli);
        if (Oli>=90 &&Oli<=100){
            System.out.println("A "+" a'lo daraja " );
        } else if (Oli>=80&&Oli<=90){
            System.out.println("B "+" o'rta daraja");

        }
        else if (Oli>=70&&Oli<=80){
            System.out.println("c "+" qoniqarli");
        }
        else {
            System.out.println("D "+" Qoniqarsiz");
        }
    }
}
