package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TESTEDATACHAVE
* @generated
*/
@Entity
@IdClass(TesteDataChavePK.class)
@Table(name = "\"TESTEDATACHAVE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.TesteDataChave")
public class TesteDataChave implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Id
    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = true, insertable=true, updatable=true)
        private java.util.Date data;

    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * Construtor
    * @generated
    */
    public TesteDataChave(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public TesteDataChave setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public TesteDataChave setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    
    public java.util.Date getData(){
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public TesteDataChave setData(java.util.Date data){
        this.data = data;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
TesteDataChave object = (TesteDataChave)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        if (data != null ? !data.equals(object.data) : object.data != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        result = 31 * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

}