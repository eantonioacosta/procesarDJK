/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djk.procesardkj.controller;

import djk.procesardkj.datos.ConfigJpaController;
import djk.procesardkj.datos.exceptions.PreexistingEntityException;
import djk.procesardkj.domain.Config;
import java.util.List;

public class ControllerConfig {

    ConfigJpaController dao;
    public ControllerConfig() {
        dao = new ConfigJpaController();
    }

    public void registrar(Config config) throws Exception, NullPointerException, PreexistingEntityException {
        dao.create(config);
    }

    public void actualizar(Config config) throws Exception {
        dao.edit(config);
    }

    public void eliminar(int id) throws Exception, NullPointerException {
        dao.destroy(id);
    }

    public List<Config> verMatriculas() throws Exception {
        return dao.findConfigEntities();
    }
    public String getNombreInstitucion() throws Exception{
        return dao.findByInstitucion().getValor().toUpperCase();
    }
}
