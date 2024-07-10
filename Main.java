package date;

public class main {

  public static void main(String[] args) {
  
   System.out.println("MY-DATABASE ");
    String[][] nomes = new String[4][4];
    String[][] tel = new String[4][4];
// CADASTRANDO DADOS
    nomes[0][0] = "MIKE";
    tel[0][0] = "+55 84 8113-0087";
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
