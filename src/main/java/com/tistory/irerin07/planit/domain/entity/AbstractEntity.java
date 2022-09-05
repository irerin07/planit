package com.tistory.irerin07.planit.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 민경수
 * @description abstract entity
 * @since 2022.09.05
 **********************************************************************************************************************/
@Getter
@EqualsAndHashCode(callSuper = false, of = {"seq"})
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 8966089289039726962L;

    /**
     * 일련번호
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    protected Long seq;

}
