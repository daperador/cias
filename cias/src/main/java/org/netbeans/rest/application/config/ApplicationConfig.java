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
        resources.add(SalaServicio.class);
        resources.add(TipoCertificacionServicio.class);
        resources.add(PersonaServicio.class);
        resources.add(EntidadAutorizadoraServicio.class);
        resources.add(PersonaNaturalServicio.class);
        resources.add(TipoDocumentoServicio.class);
        resources.add(CentroFormacionServicio.class);
        resources.add(CursoServicio.class);
        resources.add(MunicipioServicio.class);
        resources.add(DepartamentoServicio.class);
        resources.add(InstructorServicio.class);
        resources.add(EmpresaServicio.class);
        resources.add(CertificacionServicio.class);
        resources.add(VinculacionServicio.class);
    }

}
