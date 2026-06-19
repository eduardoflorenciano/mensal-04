package controller;

import service.produto.ProdutoService;
import model.Produto;
import java.util.List;

public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController() {
        this.produtoService = new ProdutoService();
    }

    public void cadastrarProduto( String nome,
                                  double preco,
                                  int estoque,
                                  String categoria,
                                  String marca){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidadeEstoque(estoque);
        produto.setCategoria(categoria);
        produto.setMarca(marca);

        produtoService.cadastrar(produto);
    }
    public void atualizarProduto( Long id,
                                  String nome,
                                  double preco,
                                  int estoque,
                                  String categoria,
                                  String marca){
        produtoService.atualizar(
                id,
                nome,
                preco,
                estoque,
                categoria,
                marca
        );
    }

    public void excluirProduto(Long id) {
        produtoService.remover(id);
    }

    public Produto buscarPorId(Long id) {
        return produtoService.buscarPorId(id);
    }

    public List<Produto> listarProdutos() {
        return produtoService.listarTodosProdutos();
    }

    public List<Produto> buscarPorNome(String nome) {
        return produtoService.buscarPorNomeLista(nome);
    }

    public List<Produto> buscarPorCategoria(String categoria) {
        return produtoService.buscarPorCategoriaLista(categoria);
    }

    public String gerarRelatorio() {
        return produtoService.gerarRelatorio();
    }
}