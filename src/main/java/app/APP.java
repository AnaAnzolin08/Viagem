package app;

import Emuns.Destinos;
import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;

import java.util.ArrayList;
import java.util.List;

public class APP {
    public static void main(String[] args) throws Exception {
        Viagem viagem = new Viagem(Destinos.MANUS);

        viagem.setDestino(Destinos.MANUS);
        viagem.setDestino(Destinos.MARINGA);
        viagem.setDestino(Destinos.RECIFE);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Bruno");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2= new Acompanhante();
        acompanhante2.setNome("Angela");
        acompanhante2.setConfirmouCadastro(false);


        List<Acompanhante> acompanhates = new ArrayList<>();
        acompanhates.add(acompanhante1);
        acompanhates.add(acompanhante1);
        acompanhates.add(acompanhante1);
        acompanhates.add(acompanhante1);
        acompanhates.add(acompanhante1);


        try {
            viagem.setAcompanhetes(acompanhates);
        }catch (Exception execao) {
            System.out.println("Ocorreu um erro ");
            System.out.println(execao.getMessage());
        }
        System.out.println(viagem.getDestino().getCidade());


        for (Acompanhante acompanhante : viagem.getAcompanhantes()) {
            System.out.println(acompanhante.getNome() + " " + acompanhante.isConfirmouCadastro());

            System.out.println(viagem.getDestino().getCidade());
            //System.out.println(viagem.getAcompanhantes().size());
            //System.out.println(viagem.getAcompanhantes().get().getNome());
            //System.out.println(viagem.getAcompanhantes().get().getNome());

            ViagemNacional viagemNacional1 = new ViagemNacional(Destinos.MANUS);
            try {
                viagemNacional1.setAcompanhetes(acompanhates);
            } catch (Exception excecao) {
                System.out.println("Ocorreu um erro:");
                System.out.println(excecao.getMessage());
            }

            viagemNacional1.setCpf("11122233344");


            ViagemInternacional viagemInternacional1 = new ViagemInternacional(Destinos.CHICAGO);
            try {
                viagemInternacional1.setAcompanhetes(acompanhates);
            } catch (Exception excecao) {

                System.out.println("Ocorreu um problema:");
                System.out.println(excecao.getMessage());
            }

            viagemInternacional1.setPassaorte("111-5");

            System.out.println(viagemNacional1.getCpf());
            System.out.println(viagemInternacional1.getPassaorte());

            System.out.println(viagemNacional1.getCpf());
            System.out.println(viagemInternacional1.getPassaorte());

            System.out.println(viagemInternacional1.calcularPrevisãoDeDiasParaRetorno());

            System.out.println(viagemNacional1.calcularPrevisãoDeDiasParaRetorno());
        }
    }
}

