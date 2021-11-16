package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ITEMSOLICITACAO
* @generated
*/
@Entity
@Table(name = "\"ITEMSOLICITACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ItemSolicitacao")
public class ItemSolicitacao implements Serializable {

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
    @Column(name = "item", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String item;

    /**
    * @generated
    */
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;

    /**
    * @generated
    */
    @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valor;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_solicitacao", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Solicitacao solicitacao;

    /**
    * Construtor
    * @generated
    */
    public ItemSolicitacao(){
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
    public ItemSolicitacao setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém item
    * return item
    * @generated
    */
    
    public java.lang.String getItem(){
        return this.item;
    }

    /**
    * Define item
    * @param item item
    * @generated
    */
    public ItemSolicitacao setItem(java.lang.String item){
        this.item = item;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    
    public java.lang.String getDescricao(){
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public ItemSolicitacao setDescricao(java.lang.String descricao){
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém valor
    * return valor
    * @generated
    */
    
    public java.lang.Double getValor(){
        return this.valor;
    }

    /**
    * Define valor
    * @param valor valor
    * @generated
    */
    public ItemSolicitacao setValor(java.lang.Double valor){
        this.valor = valor;
        return this;
    }
    /**
    * Obtém solicitacao
    * return solicitacao
    * @generated
    */
    
    public Solicitacao getSolicitacao(){
        return this.solicitacao;
    }

    /**
    * Define solicitacao
    * @param solicitacao solicitacao
    * @generated
    */
    public ItemSolicitacao setSolicitacao(Solicitacao solicitacao){
        this.solicitacao = solicitacao;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ItemSolicitacao object = (ItemSolicitacao)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}