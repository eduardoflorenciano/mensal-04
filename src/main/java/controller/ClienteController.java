package controller;

import service.cliente.ClienteService;
import model.Cliente;
import java.util.List;

public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }

    public void cadastrarCliente(String nome, String telefone, String cpf) {

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        cliente.setCpf(cpf);

        clienteService.cadastrarCliente(cliente);
    }

    public void atualizarCliente(
            Long id,
            String nome,
            String cpf,
            String telefone
            ) {

        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        cliente.setCpf(cpf);

        clienteService.atualziar(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteService.listarTodosClientes();
    }

    public List<Cliente> buscarPorNome(String nome) {
        return clienteService.buscarPorNomeLista(nome);
    }

    public void excluirCliente(Long id) {
        clienteService.remover(id);
    }

    public Cliente buscarPorId(Long id) {
        return clienteService.buscarPorId(id);
    }
}