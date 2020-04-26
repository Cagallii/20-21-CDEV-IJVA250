package com.example.demo.controller.clientsidetemplating.dto;

/**
 * Classe permettant d'exposer des données au format JSON au client.
 */
public class ClientDto {
    public Long id;
    public String nom;
    public String prenom;

    public ClientDto(Long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
}
