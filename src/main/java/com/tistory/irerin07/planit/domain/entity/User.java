package com.tistory.irerin07.planit.domain.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 민경수
 * @description user
 * @since 2022.09.05
 **********************************************************************************************************************/
@Getter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "tb_temp_space_type")

public class User extends AbstractEntity{

    private static final long serialVersionUID = 2291113740654922897L;

    @Column(name = "email")
    private String email;

    public User(String email) {
        this.email = email;
    }

}