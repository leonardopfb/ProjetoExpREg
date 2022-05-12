/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01_er;

//import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ACER
 */
public class Projeto02_ER {
    
       public static void ValidaFamilia(String regex, String[] familia) {
     
         for(String n: familia){
        boolean b = Pattern.matches(regex, n);
         String resultado = (b)?"\' é válido" :"\' é inválido";
            System.out.println("A Familia  \'" + n + resultado);
         }
        
    } 
        
        public static void main(String[] args) {
 //Casais heterossexuais mais velhos que os filhos com pelo menos duas filhas mulheres,
 //ou pelo menos um filho homem, ou ainda pelo menos dois filhos homens e uma filha
 //mulher.
          String regex_A = "(MH|HM){1}((h*mm+h*)|(m*hh*m*)|(h*hhm+))";
          String[] familia_A = {"HMh","HMhhm","HMmm","Hm","HMmmmm","HMmhm"};
            System.out.println("QUESTÃO A");
          ValidaFamilia(regex_A, familia_A);
// Casais heterossexuais mais velhos que os filhos e com uma quantidade ímpar de filhas
//  mulheres.
       
            String regex_B = "(MH|HM){1}h*m(mm)*h*";
          String[] familia_B = {"HMhhmmmh","HMm","HMhmmmh","HMhhmmh","HMmmmm"};
           System.out.println("QUESTÃO B");
          ValidaFamilia(regex_B, familia_B);
 //Casais heterossexuais mais velhos que os filhos, com a filha mais velha mulher e o filho mais novo homem.
          String regex_C = "(MH|HM){1}m(m|h)*h";
          String [] familia_C = {"HMmhmmhmhh","HMmh","HMhm","HMhhhhmmm"};
          System.out.println("QUESTÃO C");
          ValidaFamilia(regex_C, familia_C);
  //Casais homossexuais mais velhos que os filhos, com pelo menos seis filhos, em que os dois primeiros filhos formam um casal 
  //e os últimos também.
          String regex_D = "(MM|HH){1}(hm|mh)+(m|h)+(m|h)+(hm|mh)+";
          String[] familia_D = {"HHhmhhhm","MMmhhhmmmh","HHmhmh","HMmhhhmmmh"};
          System.out.println("QUESTÃO D");
          ValidaFamilia(regex_D, familia_D);
            //Casais homossexuais mais velhos que os filhos, em que o sexo dos filhos é alternado conforme a ordem de nascimento..
          String regex_E = "(MM|HH){1}(h(mh)*|m(hm)*)";
          String[] familia_E = {"HHhmh","HHmhm","HHhmmh","HHmhhm","HHhmhmh","HHmhmhm"};
          System.out.println("QUESTÃO E");
          ValidaFamilia(regex_E, familia_E);
 // Casais homossexuais mais velhos que os filhos, com qualquer quantidade de filhos
//homens e mulheres, mas que não tiveram dois filhos homens consecutivos
          String regex_F = "(MM|HH){1}(m*hm+|m*)*h?$";
          String[] familia_F = {"HHhm","HHmhm","HHhhmh","HHmhhm","HHhmhmh","HHmhmhm"};
          System.out.println("QUESTÃO F");
          ValidaFamilia(regex_F, familia_F);
          
 // Arranjo de no mínimo x∈ℕ e no máximo y∈ℕ , com x>0 , y>0 , e x≤y , de
//adultos (Hs ou Ms) mais velhos que os filhos, com qualquer quantidade de filhos
//homens e mulheres, mas que os três filhos mais novos não foram homens.
          String regex_G = "(M+|H+)+(h*m*)*(mmm)$";
          String[] familia_G = {"MMhmmm","HHMHmmhmhmhmmm","HMMHhhmh","MHHmhhmmm","HHhmhmh","HHmhmhm"};
          System.out.println("QUESTÃO G");
          ValidaFamilia(regex_G, familia_G);
    }
}
