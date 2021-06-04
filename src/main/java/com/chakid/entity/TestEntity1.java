package com.chakid.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author chakid
 * @version 1.0
 * @date 2021/6/3 18:24
 * @description
 */
@Data
@Entity
@Table(name = "tbl_test_entity1")
public class TestEntity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content1;
}
