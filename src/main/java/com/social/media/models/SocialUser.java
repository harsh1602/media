package com.social.media.models;

import jakarta.persistence.*;
import org.springframework.context.annotation.Profile;

@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "social_profile_id") // here we are telling JPA that I want a relationship to be managed by this name.
    private SocialProfile socialProfile;
}
