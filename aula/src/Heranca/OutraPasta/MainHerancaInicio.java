package Heranca.OutraPasta;

import Heranca.Inicio.Cliente;
import Heranca.Inicio.ClienteFisico;
import Heranca.Inicio.ClienteJuridico;

public class MainHerancaInicio {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.getCodigo();
        cliente.getEndereco();
        cliente.localizarEndereco(1);

        ClienteFisico fisico = new ClienteFisico();
        fisico.getCodigo();
        fisico.getEndereco();
        fisico.localizarEndereco(2);
        fisico.getNome();
        fisico.getCpf();
        fisico.verificarCpf("");

        ClienteJuridico juridico = new ClienteJuridico();
        juridico.getCodigo();
        juridico.getEndereco();
        juridico.localizarEndereco(2);
        juridico.getCnpj();
        juridico.getRazaoSocial();
        juridico.verificarCNPJ();
    }
}
