package Cadastro;

public class Juridica extends Pessoa{
    private String xCNPJ;
    public Juridica(){
        super();
    }
    public Juridica(String nome){
        super(nome);
    }

    public java.lang.String getxCNPJ() {
        return xCNPJ;
    }
    //public String getxCNPJ(){
        //return xCNPJ;
    //}

    public String getxNome(){
        return super.getxNome();
    }
}
