package com.pcvpmo.pdsw.upteho.dao.mybatis;

import com.google.inject.Inject;
import com.pcvpmo.pdsw.upteho.dao.CursoDAO;
import com.pcvpmo.pdsw.upteho.dao.PersistenceException;
import com.pcvpmo.pdsw.upteho.dao.mybatis.mappers.CursoMapper;
import com.pcvpmo.pdsw.upteho.entities.Curso;
import java.util.List;

/**
 * Implementacion de CursoDAO MyBATIS
 * @author Daniel Ospina
 */
public class MyBATISCursoDAO implements CursoDAO {
    
    @Inject
    private CursoMapper cursoMapper;
    
    @Override
    public List<Curso> consultarCursos() throws PersistenceException {
        return cursoMapper.consultarCursos();
    }

    @Override
    public Curso consultarCurso(int id) throws PersistenceException {
        return cursoMapper.consultarCurso(id);
    }

    @Override
    public List<Curso> consultarCursosPorPeriodo(String nombre) throws PersistenceException {
        return cursoMapper.consultarCursosPorPeriodo(nombre);       
    }

    @Override
    public int getNextCurso() throws PersistenceException {
        return cursoMapper.getNextCurso();
    }

    @Override
    public void registrarCurso(int id, int idProfesor, String siglaMateria, String nombrePeriodo) throws PersistenceException {
        cursoMapper.registrarCurso(id, idProfesor, siglaMateria, nombrePeriodo);
    }

}
