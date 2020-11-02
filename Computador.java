public class Computador {
    private boolean Ligado;
    private String Processador;
    private int Memoria;

    public Computador() {

    }

    public Computador(boolean ligado) {
        Ligado = ligado;
    }

    public Computador(boolean ligado, String processador, int memoria) {
        Ligado = ligado;
        Processador = processador;
        Memoria = memoria;
    }

    public boolean isLigado() {
        return Ligado;
    }

    public void setLigado(boolean ligado) {
        Ligado = ligado;
    }

    public String getProcessador() {
        return Processador;
    }

    public void setProcessador(String processador) {
        Processador = processador;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int memoria) {
        Memoria = memoria;
    }

    public void ligar() {
        System.out.println("iniciando computador ... ");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException eInterruptedException) {
            System.out.println("** RuntimeException from main");
        }

        this.setLigado(true);
        System.out.println("computador " + this.getProcessador() + " ligado com sucesso ");
    }

    public void desligar() {
        System.out.println("desligando o computador ... ");

        try {
            Thread.sleep(3000);
        } catch(InterruptedException eInterruptedException) {
            System.out.println("** RuntimeException from main");
        }

        this.setLigado(false);
        System.out.println("computador " + this.getProcessador() + " desligado com sucesso ");
    }
}