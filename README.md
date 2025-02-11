# Microservizio E-commerce - Spring Boot

Questo progetto crea un microservizio di e-commerce in Java utilizzando **Spring Boot**. L'applicazione espone API RESTful per gestire i prodotti, il carrello e gli ordini di un negozio online.

## Introduzione

Questo progetto implementa un microservizio di e-commerce che consente di gestire:

- **Prodotti**: Creare, visualizzare, e cancellare prodotti dal negozio.
- **Carrello**: Aggiungere e visualizzare articoli nel carrello.
- **Ordini**: Gestire gli ordini dei clienti.

Le funzionalità sono esposte tramite API REST, che possono essere utilizzate da client esterni (come un'applicazione frontend).

## Prerequisiti

Per eseguire il progetto localmente, assicurati di avere:

- **Java 21 o superiore**
- **Maven** o **Gradle** per la gestione delle dipendenze
- Un IDE come **IntelliJ IDEA**, **Eclipse** o **VS Code**
- **Postman** o un altro strumento per testare le API

## Setup del Progetto

### 1. Creazione del Progetto

Puoi creare un progetto Spring Boot tramite [Spring Initializr](https://start.spring.io/):

- Scegli **Java** come linguaggio.
- Imposta il **Group** e l'**Artifact** (per esempio `com.example.shop`).
- Seleziona le seguenti dipendenze:
  - **Spring Web**
  - **Spring Data JPA**
  - **MySQL** (per sviluppo locale)
  - **Spring Boot DevTools** (per il live reload)

Scarica il progetto e decomprimilo, poi importalo nel tuo IDE preferito.

Avvia il progetto, prima mvn clean install.


