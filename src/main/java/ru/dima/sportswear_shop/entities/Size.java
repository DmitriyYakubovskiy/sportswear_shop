package ru.dima.sportswear_shop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "sizes")
public class Size {
    @Id
    @ColumnDefault("nextval('sizes_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "value", nullable = false, length = 10)
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}