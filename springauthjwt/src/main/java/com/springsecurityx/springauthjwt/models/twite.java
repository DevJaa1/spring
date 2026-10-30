package com.springsecurityx.springauthjwt.models;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "tb_twit")
public class twite {

    @Id 
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column (name = "twit_id")
    private Long twitId;


    private User userTwit;


    private String content;

    @CreationTimestamp 
    private Instant creationTimeStamp;

    public Long getTwitId() {
        return twitId;
    }

    public void setTwitId(Long twitId) {
        this.twitId = twitId;
    }

    public User getUserTwit() {
        return userTwit;
    }

    public void setUserTwit(User userTwit) {
        this.userTwit = userTwit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreationTimeStamp() {
        return creationTimeStamp;
    }

    public void setCreationTimeStamp(Instant creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }


    
}
