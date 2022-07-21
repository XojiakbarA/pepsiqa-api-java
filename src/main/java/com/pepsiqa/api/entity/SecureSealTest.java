package com.pepsiqa.api.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "secure_seal_tests")
@Data
public class SecureSealTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "analysis_values", columnDefinition = "json", nullable = false)
    private String testValues;

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
