package dto;

import Emuns.Destinos;
import Interfaces.CalculadoraDePrevisão;
import utis.ArquivosUtis;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;



public class ViagemNacional extends Viagem implements CalculadoraDePrevisão {
    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf() {
        return this.cpf;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhetes(List<Acompanhante> acompanhetes) throws Exception {
        int limiteDeAcompanhetes = Integer.parseInt(ArquivosUtis.getPropriedade("viagem.nacional.acompanhetes.limite"));

        if (acompanhetes.size() <= limiteDeAcompanhetes) {
            super.setAcompanhetes(acompanhetes);
        } else {

            throw new Exception("Viagens nacionais  não permite mais que" + limiteDeAcompanhetes + "acompanhetes");
        }
    }

    public int calcularPrevisãoDeDiasParaRetorno() {
        int quantidadeDeDias = 0;

        switch (this.getDestino()) {
            case MANUS: quantidadeDeDias = 4; break ;
            case RECIFE:quantidadeDeDias = 3; break;
            case GOAIS: quantidadeDeDias = 2; break;
            case MARINGA:quantidadeDeDias = 1; break;
            case OSASCO: quantidadeDeDias = 0;break;
        }
        return quantidadeDeDias;
    }

}


