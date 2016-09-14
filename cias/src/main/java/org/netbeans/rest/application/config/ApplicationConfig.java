package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import co.com.runt.cias.servicio.*;

/**
 *
 * @author daniel
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.com.runt.cias.servicio.CentroFormacionServicio.class);
        resources.add(co.com.runt.cias.servicio.CertificacionServicio.class);
        resources.add(co.com.runt.cias.servicio.CursoServicio.class);
        resources.add(co.com.runt.cias.servicio.DepartamentoServicio.class);
        resources.add(co.com.runt.cias.servicio.EmpresaServicio.class);
        resources.add(co.com.runt.cias.servicio.EntidadAutorizadoraServicio.class);
        resources.add(co.com.runt.cias.servicio.InstructorServicio.class);
        resources.add(co.com.runt.cias.servicio.MunicipioServicio.class);
        resources.add(co.com.runt.cias.servicio.PersonaNaturalServicio.class);
        resources.add(co.com.runt.cias.servicio.PersonaServicio.class);
        resources.add(co.com.runt.cias.servicio.SalaServicio.class);
        resources.add(co.com.runt.cias.servicio.TipoCertificacionServicio.class);
        resources.add(co.com.runt.cias.servicio.TipoDocumentoServicio.class);
        resources.add(co.com.runt.cias.servicio.VinculacionServicio.class);
    }

}
