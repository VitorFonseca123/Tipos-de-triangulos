package tipos.de.triângulos;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class TiposDeTriângulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[] VET = new float[3];
        
        for(int i =0; i<3; i++){
              VET[i] = in.nextFloat();
        }
        for (int i = 1; i < VET.length; i++) {
            for (int j = 0; j < i; j++) {
                if (VET[i] >VET[j]) {
                    float temp = VET[i];
                    VET[i] = VET[j];
                    VET[j] = temp;
        }
    }
}
    
        float A=VET[0];
        float B=VET[1];
        float C=VET[2];
        int y = 0;
        if(A>=(B+C)){
            System.out.println("NAO FORMA TRIANGULO");
            y++;
        }else if(Math.pow(A, 2)==(Math.pow(B, 2)+Math.pow(C, 2))){
            System.out.println("TRIANGULO RETANGULO");
        }else if(Math.pow(A, 2) > ((Math.pow(B, 2))+(Math.pow(C, 2)))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if(Math.pow(A, 2) < (Math.pow(B, 2)+Math.pow(C, 2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(y==0){
             if(A==B && B==C){
                System.out.println("TRIANGULO EQUILATERO");
        }else if((A == B && A != C) || (A == C && A != B) || (B == C && B != A)){
            System.out.println("TRIANGULO ISOSCELES");
        }
        }
       
    }
    
}
