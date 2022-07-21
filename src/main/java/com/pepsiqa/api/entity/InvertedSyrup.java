package com.pepsiqa.api.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "inverted_syrups")
@Data
public class InvertedSyrup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "blend_syrup_brix", nullable = false)
    private Float blendSyrupBrix;

    @Column(name = "drink_brix", nullable = false)
    private Float drinkBrix;

    @Column(name = "blend_density", nullable = false)
    private Float blendDensity;

    @Column(name = "drink_density", nullable = false)
    private Float drinkDensity;

    @Column(name = "drink_inverted_brix", nullable = false)
    private Float drinkInvertedBrix;

    @Column(name = "drink_acidity", nullable = false)
    private Float drinkAcidity;

    @Column(name = "drink_ph", nullable = false)
    private Float drinkpH;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToOne(targetEntity = Syrup.class)
    @JoinColumn(name = "syrup_id", nullable = false)
    private Syrup syrup;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
