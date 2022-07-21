package com.pepsiqa.api.entity;

import com.pepsiqa.api.utils.ShiftType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shift_modes")
@Data
public class ShiftMode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(columnDefinition = "varchar(255) default 'TYPE1'", nullable = false)
    private ShiftType type;

    @Column(name = "shift_mode_values", columnDefinition = "json", nullable = false)
    private String shiftModeValues;

    @Column(columnDefinition = "json", nullable = false)
    private String day;

    @Column(columnDefinition = "json")
    private String night;

    @Column(columnDefinition = "json", nullable = false)
    private String sequence;

    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Date updatedAt;
}
