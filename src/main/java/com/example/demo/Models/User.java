package com.example.demo.Models;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "users")
// public class User {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     private String name;
//     private String email;

//     /**
//      * @return Long return the id
//      */
//     public Long getId() {
//         return id;
//     }

//     /**
//      * @param id the id to set
//      */
//     public void setId(Long id) {
//         this.id = id;
//     }

//     /**
//      * @return String return the name
//      */
//     public String getName() {
//         return name;
//     }

//     /**
//      * @param name the name to set
//      */
//     public void setName(String name) {
//         this.name = name;
//     }

//     /**
//      * @return String return the email
//      */
//     public String getEmail() {
//         return email;
//     }

//     /**
//      * @param email the email to set
//      */
//     public void setEmail(String email) {
//         this.email = email;
//     }

// }
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // getters and setters
}