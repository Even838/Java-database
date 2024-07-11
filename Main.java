package date;
import java.time.LocalDateTime;


public class main {

  public static void main(String[] args) {
  
    
LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataHoraAtual);
      
      // imprimindo data atual no console
      
        
        System.out.println("");

        // Imprimindo espaço
        
        System.out.println("MY DATABASE");

        System.out.println("");
        // imprimindo espaço
        
        
        
        String[][] nomes = new String[4][4];
        String[][] tel = new String[4][4];

        // criando tabelas


       // inserindo datos nas tabelas
        nomes[0][0] = "MIKE";
        tel[0][0] = "+55 84 8113-00";
        nomes[1][1] = "Steve";
        tel[1][1] = "5584848";
        nomes[2][2] = "even";
        tel[2][2] = "+77 9398399293";
        nomes[3][3] = "Elizanhet";
        tel[3][3] = "+77 928902";

        // Imprime os dados
        for (int i = 0; i < 4; i++) {
            System.out.println("Nome: " + nomes[i][i] + " | Tel: " + tel[i][i]);
        }
   
  

  }
  }
