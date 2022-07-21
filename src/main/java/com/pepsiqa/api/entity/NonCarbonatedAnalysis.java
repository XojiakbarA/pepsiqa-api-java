package com.pepsiqa.api.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "non_carbonated_analyses")
@Data
public class NonCarbonatedAnalysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "temperature_after_filling", nullable = false)
    private Float temperatureAfterFilling;

    @Column(name = "temperature_before_tilter", nullable = false)
    private Float temperatureBeforeTilter;

    @Column(name = "temperature_after_cooling", nullable = false)
    private Float temperatureAfterCooling;

    @Column(name = "pressure_after_filling", nullable = false)
    private Float pressureAfterFilling;

    @Column(name = "pressure_after_cooling", nullable = false)
    private Float pressureAfterCooling;

    @Column(name = "brix_after_filling", nullable = false)
    private Float brixAfterFilling;

    @Column(name = "brix_after_cooling", nullable = false)
    private Float brixAfterCooling;

    @Column(nullable = false)
    private Float turbidity;

    @Column(nullable = false)
    private Float density;

    @Column(nullable = false)
    private Float acidity;

    @Column(nullable = false)
    private Float ph;

    @Column(nullable = false)
    private Float fullness;

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

    @ManyToOne(targetEntity = FillingLine.class)
    @JoinColumn(name = "filling_line_id", nullable = false)
    private FillingLine fillingLine;

    @ManyToOne(targetEntity = Format.class)
    @JoinColumn(name = "format_id", nullable = false)
    private Format format;

    @ManyToOne(targetEntity = ContainerSupplier.class)
    @JoinColumn(name = "container_supplier_id", nullable = false)
    private ContainerSupplier containerSupplier;

    @ManyToOne(targetEntity = CapSupplier.class)
    @JoinColumn(name = "cap_supplier_id", nullable = false)
    private CapSupplier capSupplier;
}
