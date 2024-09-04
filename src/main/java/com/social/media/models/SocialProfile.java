package com.social.media.models;

import jakarta.persistence.*;

@Entity
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // this means that the relationship will be managed by 'socialProfile' being defined in the socialUser class, since the naming matches with the mapped name.
    // this is basically the non owning side in the relationship. So, no columm needs to be created here.
    @OneToOne(mappedBy = "socialProfile")  // this will create a foreign key pointing to the table defined. (here, SocialUser)
    private SocialUser user;
}
