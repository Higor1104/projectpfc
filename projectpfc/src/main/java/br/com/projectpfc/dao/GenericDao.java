package br.com.projectpfc.dao;

import java.io.Serializable;
import java.util.List;

import br.com.projectpfc.excecao.DatabaseException;

public interface GenericDao<T, ID extends Serializable> {
	
	void salvar(T obj) throws DatabaseException;
	
	void excluir(T obj) throws DatabaseException;
	
	void alterar(T obj) throws DatabaseException;
	
	List<T> consultar() throws DatabaseException;
	
	Long obterQuantidadeRegistros() throws DatabaseException;
	
	T obter(ID id) throws DatabaseException;
	
}
