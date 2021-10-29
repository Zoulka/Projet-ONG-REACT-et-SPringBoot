package com.example.ongbackend.model;

import javax.persistence.*;



@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prénom")
    private String prenom;
    @Column(name = "Résidence")
    private String residence;
   @Column(name = "Date_de_Naissance")
    private String date_naissance;
   @Column(name = "Tel_Numéro")
   private String Tel_numero;
   @Column(name = "email")
   private String email;

    public User(){

    }

    public User(String nom, String prenom, String residence, String date_naissance, String Tel_numero,
                String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance= date_naissance;
        this.residence = residence;
        this.Tel_numero= Tel_numero;
        this.email= email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getTel_numero() {
        return Tel_numero;
    }

    public void setTel_numero(String tel_numero) {
        Tel_numero = tel_numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }
}
