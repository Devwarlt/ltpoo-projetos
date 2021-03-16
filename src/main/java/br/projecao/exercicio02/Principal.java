package br.projecao.exercicio02;

public class Principal {
    public static void main(String[] args) {
        try {
            Socio socio = new Socio();
            socio.registrar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
