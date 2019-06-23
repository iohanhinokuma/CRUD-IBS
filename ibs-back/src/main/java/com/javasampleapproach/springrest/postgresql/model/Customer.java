package com.javasampleapproach.springrest.postgresql.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "active")
	private boolean active;
	
	@Column(name = "cpf")
	private String cpf;	
	
	@Column(name = "data_nascimento")
	private Date data_nascimento;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "observacao")
	private String observacao;

	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;

	
	public Customer(String name, int age, String cpf, Date data_nascimento, String endereco, String observacao,String email, String telefone) {
		this.name = name;
		this.age = age;
		this.active = false;
		this.cpf= cpf;
		this.data_nascimento= data_nascimento;
		this.endereco= endereco;
		this.observacao= observacao;
		this.email=email;
		this.telefone= telefone;
	}

	public long getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setDataNascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	public Date getDataNascimento() {
		return this.data_nascimento;
	}	
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String getObservacao() {
		return this.observacao;
	}	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getemail() {
		return this.email;
	}	
	
	
	public String getCpf() {
		return this.cpf;
	}

	public String getName() {
		return this.name;
	}
	
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", cpf=" + cpf +  ", email=" + email +", data_nascimento=" + data_nascimento +", endereco=" + endereco +", observacao=" + observacao +", telefone=" + telefone +"]";
	}
	
}
