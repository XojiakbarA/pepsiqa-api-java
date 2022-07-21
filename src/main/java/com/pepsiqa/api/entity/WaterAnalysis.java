package com.pepsiqa.api.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "water_analyses")
@Data
public class WaterAnalysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private Float hardness;

    @Column(nullable = false)
    private Float tds;

    @Column(nullable = false)
    private Float alkalinity;

    @Column(nullable = false)
    private Float conductivity;

    @Column(nullable = false)
    private Float turbidity;

    @Column(nullable = false)
    private Float temperature;

    @Column(nullable = false)
    private Float ph;

    @Column(nullable = false)
    private Float cl;

    @Column(nullable = false)
    private Float fe;

    @Column(nullable = false)
    private Float mn;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
