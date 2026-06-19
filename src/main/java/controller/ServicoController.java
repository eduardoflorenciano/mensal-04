package controller;

import java.util.List;

import model.Servico;
import service.servico.ServicoService;

public class ServicoController {
    private final ServicoService servicoService;

    public ServicoController() {
        this.servicoService = new ServicoService();
    }
    public void cadastrarServico(
            String nome,
            double preco,
            int duracao,
            String tipo) {

        Servico servico = new Servico();

        servico.setNome(nome);
        servico.setPreco(preco);
        servico.setDuracaoMinutos(duracao);
        servico.setTipo(tipo);

        servicoService.cadastrar(servico);
    }

    public void atualizarServico(
            Long id,
            String nome,
            double preco,
            int duracao,
            String tipo) {

        servicoService.atualizar(
                id,
                nome,
                preco,
                duracao,
                tipo
        );
    }

    public void excluirServico(Long id) {
        servicoService.remover(id);
    }

    public Servico buscarPorId(Long id) {
        return servicoService.buscarPorId(id);
    }

    public List<Servico> listarServicos() {
        return servicoService.listarTodosServicos();
    }

    public List<Servico> buscarPorNome(String nome) {
        return servicoService.buscarPorNomeLista(nome);
    }

    public List<Servico> buscarPorTipo(String tipo) {
        return servicoService.buscarPorTipoLista(tipo);
    }

    public String gerarRelatorio() {
        return servicoService.gerarRelatorio();
    }
}