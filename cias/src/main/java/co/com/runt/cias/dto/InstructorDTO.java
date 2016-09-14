package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstructorDTO {

    public InstructorDTO() {
        //constructor base
    }

    public InstructorDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    private PersonaNaturalDTO personaNatural;

    /**
     * @generated
     */
    /*private List<VinculacionDTO> vinculacion;
    
    public List<VinculacionDTO> getVinculacion(){
    	if(this.vinculacion==null){
    		vinculacion=new ArrayList<VinculacionDTO>();
    	}
    	return vinculacion;
    }
    
    public void setVinculacion(List<VinculacionDTO> vinculacion){
    	this.vinculacion=vinculacion;
    }
     */
    
    /**
     * @generated
     */
    /*private List<CertificacionDTO> certificacion;
    
    public List<CertificacionDTO> getCertificacion(){
    	if(this.certificacion==null){
    		certificacion=new ArrayList<CertificacionDTO>();
    	}
    	return certificacion;
    }
    
    public void setCertificacion(List<CertificacionDTO> certificacion){
    	this.certificacion=certificacion;
    }
     */
    
    /**
     * @generated
     */
    public PersonaNaturalDTO getPersonaNatural() {
        return this.personaNatural;
    }

    /**
     * @generated
     */
    public void setPersonaNatural(PersonaNaturalDTO personaNatural) {
        this.personaNatural = personaNatural;
    }

}
