package com.pepsiqa.api.entity;

import com.pepsiqa.api.utils.LineStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "filling_lines")
@Data
public class FillingLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "varchar(255) default 'STOP'", nullable = false)
    private LineStatus status;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer speed;

    @Column(nullable = false)
    private String logo;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;

    @ManyToOne(targetEntity = Container.class)
    @JoinColumn(name = "container_id", nullable = false)
    private Container container;

    @ManyToOne(targetEntity = Factory.class)
    @JoinColumn(name = "factory_id", nullable = false)
    private Factory factory;

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(targetEntity = ContainerSupplier.class)
    @JoinColumn(name = "container_supplier_id")
    private ContainerSupplier containerSupplier;

    @ManyToOne(targetEntity = CapSupplier.class)
    @JoinColumn(name = "cap_supplier_id")
    private CapSupplier capSupplier;
}
