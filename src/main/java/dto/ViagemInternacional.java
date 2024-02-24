package dto;

import Emuns.Destinos;
import Interfaces.CalculadoraDePrevisão;
import utis.ArquivosUtis;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class ViagemInternacional extends Viagem implements CalculadoraDePrevisão {
    public Destinos getPassaorte;
    private String passaorte;
    public ViagemInternacional (Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }
    public String getPassaorte(){
        return this.passaorte;
    }
    public void  setPassaorte( String passaorte) {
        this.passaorte = passaorte;
    }

    @Override
    public void setAcompanhetes(List<Acompanhante> acompanhetes) throws Exception {


    int limiteDeAcompanhete = Integer.parseInt(ArquivosUtis.getPropriedade("viagem.Internacional.acompanhetes.limite"));

    if (acompanhetes.size() <= limiteDeAcompanhete) {
        super.setAcompanhetes(acompanhetes);
    } else {
        throw  new Exception("viagem internacionais não podem ser mais que "+ limiteDeAcompanhete + "acompanhetes");
    }
  }

    public int calcularPrevisãoDeDiasParaRetorno() {
        if (this.getDestino().equals(Destinos.MIAMI)) {
            return 1;
        }

        return 0;

    }
}
