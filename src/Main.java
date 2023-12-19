import Cadastro.Fisica;
import Cadastro.Juridica;
import Cadastro.Pessoa;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fisica pessoa1 = new Fisica("Sérgio");
        System.out.println(pessoa1.getxNome());
        System.out.println(pessoa1.getxCPF());
        Juridica pessoa2 = new Juridica();
        System.out.println(pessoa2.getxNome());
        System.out.println(pessoa2.getxCNPJ());
        //Pessoa pessoa3 = new Pessoa("Duda");



    }
}