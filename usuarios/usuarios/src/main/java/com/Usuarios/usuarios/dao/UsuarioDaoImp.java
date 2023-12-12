package com.Usuarios.usuarios.dao;

import com.Usuarios.usuarios.Models.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Usuarios> getUsuarios() {
        String query="FROM Usuarios";
        return entityManager.createQuery(query).getResultList();

    }
}
