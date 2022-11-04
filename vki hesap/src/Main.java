import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner girdi=new Scanner(System.in);

        System.out.print("Kilonuz(kg):");

        double kilo= girdi.nextDouble();

        System.out.print("Boyunuz(m):");

        double boy= girdi.nextDouble();

        double vucutKitleEndeksi=kilo/(boy*boy);

        if (vucutKitleEndeksi<18.49){
            System.out.println("Vücut kitle endeksiniz:"+vucutKitleEndeksi+" ideal kilonun altındasınız.");

        }
        else if (vucutKitleEndeksi>18.49 && vucutKitleEndeksi<24.99){
            System.out.println("Vücut kitle endeksiniz:"+vucutKitleEndeksi+" ideal kilodasınız.");
        } else if (vucutKitleEndeksi>25 && vucutKitleEndeksi<29.99) {
            System.out.println("Vücut kitle endeksiniz:"+vucutKitleEndeksi+" ideal kilodan birz yükseksiniz.");
            
        }else System.out.println("Vücut kitle endeksiniz:"+vucutKitleEndeksi+" ideal kilodan çok yükseksiniz.Obezite riskiniz var.");

    }
}