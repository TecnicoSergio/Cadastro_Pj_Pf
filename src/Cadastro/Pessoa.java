package Cadastro;

public abstract class Pessoa {
    protected String xNome;
    protected Pessoa(){
        xNome = "Sérgio";
    }
    protected Pessoa(String nome){
        xNome = nome;

    }

    //public String getxNome() {
        //return xNome;
    //}
    public String getxNome() {
        return xNome;
    }


}
