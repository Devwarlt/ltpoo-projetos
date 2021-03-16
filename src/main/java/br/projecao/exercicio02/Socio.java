package br.projecao.exercicio02;

import java.util.Date;

import javax.swing.JOptionPane;

public final class Socio {
    private final String TEM_DEPENDENTE_LABEL = "Digite:\n\t1 - para cadastro de dependente.\n\t2- não possui dependente.";
    private final String SOCIO_NOME_LABEL = "[Sócio]\nNome:";
    private final String SOCIO_ENDERECO_LABEL = "[Sócio]\nEndereço: ";
    private final String SOCIO_TELEFONE_LABEL = "[Sócio]\nTelefone: ";
    private final String SOCIO_DATE_NASCIMENTO_LABEL = "[Sócio]\nData nascimento: ";
    private final String DEPENDENTE_NOME_LABEL = "[Sócio -> Dependente]\nNome: ";
    private final String DEPENDENTE_DATA_NASCIMENTO_LABEL = "[Sócio -> Dependente]\nData nascimento: ";

    private String nome;
    private String endereço;
    private String telefone;
    private Date dataNascimento;
    private Dependente dependente;

    public Socio() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean registrar() throws Exception {
        int temDependente = JOptionPaneExtensions.getJOptionInput(Integer.class, this.TEM_DEPENDENTE_LABEL);
        if (temDependente == 1) {
            String dependenteNome = JOptionPaneExtensions.getJOptionInput(String.class, this.DEPENDENTE_NOME_LABEL);
            Date dependenteDataNascimento = JOptionPaneExtensions.getJOptionInput(Date.class,
                    this.DEPENDENTE_DATA_NASCIMENTO_LABEL);

            this.dependente = new Dependente();
            this.dependente.setNome(dependenteNome);
            this.dependente.setDate(dependenteDataNascimento);

            JOptionPane.showMessageDialog(null, "Dependente implementado com sucesso!");
        }

        this.nome = JOptionPaneExtensions.getJOptionInput(String.class, this.SOCIO_NOME_LABEL);
        this.endereço = JOptionPaneExtensions.getJOptionInput(String.class, this.SOCIO_ENDERECO_LABEL);
        this.telefone = JOptionPaneExtensions.getJOptionInput(String.class, this.SOCIO_TELEFONE_LABEL);
        this.dataNascimento = JOptionPaneExtensions.getJOptionInput(Date.class, this.SOCIO_DATE_NASCIMENTO_LABEL);

        JOptionPane.showMessageDialog(null, "Sócio implementado com sucesso!");

        return true;
    }
}
