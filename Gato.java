public class Gato {
    private String Nome;
    private float Peso;
    private String Cor;

    public Gato(){

    }

    public Gato(String nome, float peso, String cor){
        Nome = nome;
        Peso = peso;
        Cor = cor;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getNome(){
        return Nome;
    }

    public float getPeso(){
        return Peso;
    }

    public String getCor(){
        return Cor;
    }

    public void miar() {
        System.out.println("O gato está miando ...");
    }

    public void correr() {
        System.out.println("O gato está correndo ...");
    }    
}
