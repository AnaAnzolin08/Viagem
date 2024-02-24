package dto;

import Emuns.Destinos;

import java.util.List;

public class Viagem {
    private Destinos destino;
    private List<Acompanhante>acompanhates;
    public Viagem(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    public Destinos getDestino() {
       return this.destino;

    }
    public void setDestino(Destinos lugarDestino) {
        this.destino = lugarDestino;
    }
    public List<Acompanhante>getAcompanhantes() {
        return this.acompanhates;
    }
    public void setAcompanhetes(List<Acompanhante>acompanhetes) throws Exception {
        this.acompanhates = acompanhetes;
    }

    public void setAcompanhete(List<Acompanhante> acompanhates) {
    }
}

