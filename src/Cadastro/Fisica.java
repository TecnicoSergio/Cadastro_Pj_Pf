package Cadastro;

public class Fisica extends Pessoa {
    private String xCPF;
    public Fisica(){
        super();
    }
    public Fisica(String nome){
        super(nome);
    }

    public java.lang.String getxCPF() {
        return xCPF;
    }
    //public String getxCPF(){
        //return xCPF;
    //}
}
