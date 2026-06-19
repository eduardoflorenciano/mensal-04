package controller;

import model.*;
import service.ordemservico.OrdemServicoService;

import java.util.List;

public class OrdemServicoController {

    private final OrdemServicoService ordemServicoService;
    private final ClienteController clienteController;
    private final AutomovelController automovelController;
    private final ServicoController servicoController;
    private final ProdutoController produtoController;

    public OrdemServicoController() {
        this.ordemServicoService = new OrdemServicoService();
        this.clienteController = new ClienteController();
        this.automovelController = new AutomovelController();
        this.servicoController = new ServicoController();
        this.produtoController = new ProdutoController();
    }

    public void cadastrarOrdem(OrdemServico ordemServico) {
        ordemServicoService.cadastrarOrdem(ordemServico);
    }

    public OrdemServico adicionarServico(Long idOrdem, Long idServico) {
        return ordemServicoService.adicionarServico(idOrdem, idServico);
    }

    public OrdemServico adicionarProduto(Long idOrdem, Long idProduto) {
        return ordemServicoService.adicionarProduto(idOrdem, idProduto);
    }

    public void finalizarOs(Long id) {
        ordemServicoService.finalizarOs(id);
    }

    public void cancelarOs(Long id) {
        ordemServicoService.cancelarOs(id);
    }

    public OrdemServico buscarPorId(Long id) {
        return ordemServicoService.buscarPorId(id);
    }

    public List<OrdemServico> listarTodasOrdens() {
        return ordemServicoService.listarTodasOrdens();
    }

    public void remover(Long id) {
        ordemServicoService.remover(id);
    }

    public List<Cliente> listarClientes() {
        return clienteController.listarClientes();
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteController.buscarPorId(id);
    }

    public List<Automovel> listarAutomoveisDoCliente(Cliente cliente) {
        return automovelController.listarAutomoveisDoCliente(cliente);
    }

    public List<Servico> listarServicos() {
        return servicoController.listarServicos();
    }

    public List<Produto> listarProdutos() {
        return produtoController.listarProdutos();
    }

    public Produto buscarProdutoPorId(Long id) {
        return produtoController.buscarPorId(id);
    }
}