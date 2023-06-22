package Tarefa.dao;

import Tarefa.Cliente;

import java.util.Collection;

public interface IClienteDAO {
    public Boolean cadastra(Cliente cliente);
    public void excluir(Long cpf);
    public Collection<Cliente> alterar (Cliente cliente);
    public Cliente consultar(Long cpf);
    public Collection<Cliente> buscarTodos();

   Boolean cadastrar(Cliente cliente);
}
