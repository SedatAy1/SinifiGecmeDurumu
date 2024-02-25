import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if (mat >= 0 && mat <= 100 && fizik >= 0 && fizik <= 100 && turkce >= 0 && turkce <= 100 && kimya >= 0 && kimya <= 100 && muzik >= 0 && muzik <= 100) {


            double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta Kaldınız");

        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz");

        }
        System.out.println("Ortalamanız : " + avarage);
        }else System.out.println("Geçersiz Not Girişi Var, Kontrol Ediniz!");
    }

        }


