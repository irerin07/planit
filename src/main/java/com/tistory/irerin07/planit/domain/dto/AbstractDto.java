package com.tistory.irerin07.planit.domain.dto;

import lombok.*;

import java.io.Serializable;

/**
 * @author 민경수
 * @description abstract dto
 * @since 2022.09.05
 **********************************************************************************************************************/
@Getter
@Setter
@EqualsAndHashCode(callSuper = false, of = {"seq"})
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public abstract class AbstractDto implements Serializable {

    private static final long serialVersionUID = -587944933194556554L;

    /**
     * 일련번호
     */
    private Long seq;

}
