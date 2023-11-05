import java.util.Scanner;
public class yeni {
    static int plus(int a, int b){
        int result=a+b;
        System.out.println("Toplamı:"+result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b ;
        System.out.println("çıkartma:"+result);
        return result;

    }
    static int times(int a, int b){
        int result = a * b ;
        System.out.println("çarpma:"+result);
        return result;

    }

    static int did(int a, int b){

        if (b==0){
            System.out.println("ikinci sayı sıfırdan farklı olmalıdır!");
            return 0 ;
        }
        int result = a / b ;
        System.out.println("bölme:"+result);
        return result;

    }
    static int power(int a, int b) {
        int result = 1;
        for (int i=1; i<=b; i++){
            result *= a;

        }

        System.out.println("üst alma işlemi:" + result);
        return result;
    }
    static int mod(int a, int b){
        System.out.println("mod işlemi:" + (a%b));

        return a%b;
    }
    static void rect(int a, int b){
        System.out.println("dikdörtgenin çevresi"+ (2*(a+b)));
        System.out.println("dikdörtgenin alanı"+ (a*b));

    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int select;

        String menu= "1.Toplama işlemi\n"
                +"2.Çıkartma işlemi\n"
                +"3.Çarpma işlemi\n"
                +"4.Bölme işlemi\n"
                +"5.üs alma işlemi\n"
                +"6.mod alma işlemi\n"
                +"7.dikdörtgenin alanı ve çevresi\n"
                +"8.çıkış yapın\n";
        System.out.print(menu);

        while (true){

            System.out.println("Bir işlem seçiniz:");
            select=input.nextInt();
            if (select==0){
                break;
            }
            System.out.print("ilk sayıyı giriniz:");
            int a= input.nextInt();
            System.out.print("ikinci sayıyı giriniz:");
            int b = input.nextInt();
            switch (select){
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    did(a,b);
                    break;
                case 5:
                    System.out.println("üs hesabı:" + power(a,b));
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    rect(a,b);
                    break;
                default:
                    System.out.println("geçersiz işlem seçtiniz!");

            }
        }
        System.out.println("güle güle!");



    }
}
