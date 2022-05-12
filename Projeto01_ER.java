/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01_er;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Projeto01_ER {

      
     public static void validaNomeSobrenome() {
    
         final String regex = "^((\\b[A-zÀ-ú']{2,40}\\b)\\s*){2,}$";
         String[] nomes = { "Ada Lovelace","Alan Turing", "Stephen Cole Kleene"
                 ,"1Alan","Alan", "A1an"," A1an Turing"," Alan turing"
        };
       
        final Pattern pattern = Pattern.compile(regex);
       
        for(String n: nomes){
               
            boolean b = Pattern.matches(regex, n);
            String resultado = (b)?"\' é válida" :"\' é inválida";
            System.out.println("A String \'" +n + resultado);
        }
        
    }
       public static void ValidEmailAddressRegex() {
        
        String[] emails = {"a@a.br","divulga@ufpa.br","a@a.com.br",
             "@", "a@.br","@a.br","T@teste.br","a@A.com.br"
        };
       String regex = "[a-z]+@[a-z]+(.com.br|.br)$";
          
        Pattern pattern = Pattern.compile(regex);
     
        for(String e: emails){
            Matcher matcher = pattern.matcher(e);
             boolean b = matcher.matches();
            String resultado = (b)?"\' é válido" :"\' é inválido";
            System.out.println("O email  \'" +e + resultado);
        }
    } 
     public static void ValidaSenhaRegex() {
        
        String[] senhas = {"518R2r5e","F123456A","1234567T","ropsSoq0","F1234567A","abcdefgH","1234567HI"

        };

         String regex ="^(?=.*[A-Z])(?=.*[0-9])(?=.+[a-z]).{8,8}$";

       
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
     
        for(String e: senhas){
            Matcher matcher = pattern.matcher(e);
             boolean b = matcher.matches();
            String resultado = (b)?"\' é válida" :"\' é inválida";
            System.out.println("A senha  \'" +e + resultado);
        }
    } 
     
      public static void ValidaCPFRegex() {
        
        String[] cpfs = { "123.456.789-09","000.000.000-00", "123.456.789-0","111.111.11-11"
        };
       String regex = "^([0-9]{3}.?){3}-?[0-9]{2}$";
            
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
     
        for(String e: cpfs){
            Matcher matcher = pattern.matcher(e);
             boolean b = matcher.matches();
            String resultado = (b)?"\' é válido" :"\' é inválido";
            System.out.println("O CPF  \'" +e + resultado);
        }
    }
          public static void ValidaTelefone() {
         String[] telefones = { "(91) 99999-9999", "(91) 999999999", "91 999999999",
             "(91) 59999-9999", "99 99999-99999", "(94)95555-5555"
        };
        String regex = "[(]?[0-9]{2}[)]?[\\s][9]{1}[0-9]{4}[-]?[0-9]{4}";
        
        Pattern pattern = Pattern.compile(regex);
        for(String e: telefones){
            Matcher matcher = pattern.matcher(e);
             boolean b = matcher.matches();
            String resultado = (b)?"\' é válido" :"\' é inválido";
            System.out.println("O Telefone  \'" +e + resultado);
        }
    }
      
         public static void ValidaDataHora() {
         String[] datas = { "31/08/2019 20:14:55", "99/99/9999 23:59:59" ,
             "99/99/9999 3:9:9", "9/9/99 99:99:99", "99/99/999903:09:09"

        };
        String regex = "\\d{2}/\\d{2}/\\d{4}\\s\\d{2}\\:\\d{2}\\:\\d{2}";
        
        Pattern pattern = Pattern.compile(regex);
        for(String e: datas){
            Matcher matcher = pattern.matcher(e);
             boolean b = matcher.matches();
            String resultado = (b)?"\' é válido" :"\' é inválido";
            System.out.println("O Numero Real  \'" +e + resultado);
        }
    } 
     
       public static void ValidaNumeroReal() {
         String[] numbers = { "-25.467", "1", "-1", "+1", "64.2", "1.", ".2", "+64,2"
        };
        String regex = "[+-]?\\d+(\\.\\d+)?";
        
        Pattern pattern = Pattern.compile(regex);
        for(String e: numbers){
            Matcher matcher = pattern.matcher(e);
             boolean b = matcher.matches();
            String resultado = (b)?"\' é válido" :"\' é inválido";
            System.out.println("O Numero Real  \'" +e + resultado);
        }
    } 
     
    public static void main(String[] args) {
      
        System.out.println("------------------------------------------------------");
        System.out.println("NOME E NOME DO MEIO E SOBRENOME");
        //questão nome e sobrenome
        validaNomeSobrenome();
        System.out.println("------------------------------------------------------");
        System.out.println("Validação Email");
        ValidEmailAddressRegex();
        System.out.println("------------------------------------------------------");
        System.out.println("Validação Senha");
        ValidaSenhaRegex();    
        System.out.println("------------------------------------------------------");
        System.out.println("Validação CPF");
        ValidaCPFRegex();   
        System.out.println("------------------------------------------------------");
        System.out.println("Validação Telefone");
        ValidaTelefone();  
        System.out.println("------------------------------------------------------");
        System.out.println("Validação Data e Hora");
        ValidaDataHora();
        System.out.println("------------------------------------------------------");
        System.out.println("Validação Numero Real");
        ValidaNumeroReal();
         
        
    }
}
