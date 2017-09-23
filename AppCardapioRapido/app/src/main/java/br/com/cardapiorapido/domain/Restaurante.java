package br.com.cardapiorapido.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Criado por Usuário em 9/18/2017.
 */

public class Restaurante implements Serializable {

    @SerializedName("id_empresa")
    private String 	idEmpresa;

    @SerializedName("id_servicos_empresa")
    private String id_servicos_empresa;

    @SerializedName("cidade")
    private String cidade;

    @SerializedName("nome_empresa")
    private String nome_empresa;

    @SerializedName("cnpj")
    private String cnpj;

    @SerializedName("endereco")
    private String endereco;

    @SerializedName("bairro")
    private String bairro;

    @SerializedName("cep")
    private String cep;

    @SerializedName("telefone")
    private String telefone;

    @SerializedName("estado")
    private String estado;

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getId_servicos_empresa() {
        return id_servicos_empresa;
    }

    public void setId_servicos_empresa(String id_servicos_empresa) {
        this.id_servicos_empresa = id_servicos_empresa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
