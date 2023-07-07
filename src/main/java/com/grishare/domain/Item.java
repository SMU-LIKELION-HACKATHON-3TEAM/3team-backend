package com.grishare.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "Item")
@Entity @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int item_id;

    @Column(name = "classification_id")
    private int classification_id;

    @Column(name = "ItemName")
    private char itemName;
}
