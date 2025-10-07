import java.util.Scanner;

public class ExemploIfEnc {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double valorconta, valorfrete, valorfinal;

        System.out.println(" Qual foi o valor da conta ? ");
        valorconta = ler.nextDouble();

        System.out.println(" Qual foi o valor do frete ? ");
        valorfrete = ler.nextDouble();

        if (valorconta < 500){
            valorfinal = valorconta + valorfrete; 
        }else if( valorconta < 1000) {
            valorfinal = valorconta + (valorfrete*0.8);
        }else if ( valorconta < 1500) {
            valorfinal = valorconta + (valorfrete*0.6);
        }else if ( valorconta < 2000) {
            valorfinal = valorconta + (valorfrete*0.5);
        }else {
            valorfinal = valorconta;
        }
        System.out.println(" O valor final da sua conta foi de R$ " + valorfinal);
    }
    
}
