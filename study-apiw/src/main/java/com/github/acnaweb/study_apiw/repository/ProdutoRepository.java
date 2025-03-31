package com.github.acnaweb.study_apiw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.acnaweb.study_apiw.model.Produto;

@Repository //Gerencia por meio da classe infomrada, fazer: insert, update, deletes...
public interface ProdutoRepository extends JpaRepository <Produto, Long>{

}
