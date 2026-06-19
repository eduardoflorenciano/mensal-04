package controller;

import model.Automovel;
import model.Cliente;
import service.automovel.AutomovelService;

import java.util.List;

public class AutomovelController {
    private final AutomovelService automovelService;

    public AutomovelController() {
        this.automovelService = new AutomovelService();
    }

    public void cadastrarAutomovel(
            String modelo,
            String placa,
            int anoFabricacao) {

        Automovel automovel = new Automovel();

        automovel.setModelo(modelo);
        automovel.setPlaca(placa);
        automovel.setAnoFabricacao(anoFabricacao);

        automovelService.cadastrar(automovel);
    }

    public void atualizarAutomovel(
            Long id,
            String modelo,
            String placa,
            int anoFabricacao) {

        Automovel automovel = new Automovel();

        automovel.setId(id);
        automovel.setModelo(modelo);
        automovel.setPlaca(placa);
        automovel.setAnoFabricacao(anoFabricacao);

        automovelService.atualizar(automovel);
    }

    public void excluirAutomovel(Long id) {
        automovelService.remover(id);
    }

    public List<Automovel> listarAutomoveis() {
        return automovelService.listarCopiaLista();
    }

    public Automovel buscarPorId(Long id) {
        return automovelService.buscarPorId(id);
    }

    public List<Automovel> listarAutomoveisDoCliente(Cliente cliente) {
        return automovelService.listarAutomoveisVinculadosDoCliente(cliente);
    }

    public void vincularAoCliente(
            Long idAutomovel,
            Long idCliente) {

        automovelService.vincularAoCliente(
                idAutomovel,
                idCliente
        );
    }

    public void desvincular(Long idAutomovel) {
        automovelService.desvincular(idAutomovel);
    }
}