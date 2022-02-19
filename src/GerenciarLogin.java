import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GerenciarLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String>cadastro = new ArrayList<>();
        cadastro.add("maria");
        cadastro.add("joao");
        List<String>senha = new ArrayList<>();
        senha.add("5678");
        senha.add("9876");


        System.out.println("Informe login:");
        String cadastroInformado = sc.next();
        System.out.println(" Informe senha:");
        String senhaInformada = sc.next();

        boolean loginIncorreto = true;



        for (int i = 0; i < cadastro.size() ; i++) {
            if (cadastroInformado.equals(cadastro.get(i))&& senhaInformada.equals(senha.get(i))) {
                loginIncorreto = false;
                Date dataHoraAtual = new Date();

                String hora = new SimpleDateFormat("HH").format(dataHoraAtual);

                int numeroHora= Integer.parseInt(hora);


                if (numeroHora >= 6 && numeroHora < 12) {
                    System.out.println("Bom dia, você se logou ao nosso sistema.");

                }else if(numeroHora >= 12 && numeroHora < 18) {
                    System.out.println("Boa tarde, você se logou ao nosso sistema.");


                }else if(numeroHora >= 18 && numeroHora < 24) {
                    System.out.println("Boa noite, você se logou ao nosso sistema.");

                }else if (numeroHora >= 0 && numeroHora < 6) {
                    System.out.println("Boa madrugada, você se logou ao nosso sistema");

                }
            }

        }if(loginIncorreto) {
            System.out.println("Usuário e/ou senha incorretos");
        }

    }
}
