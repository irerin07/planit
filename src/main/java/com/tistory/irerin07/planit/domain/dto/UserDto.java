package com.tistory.irerin07.planit.domain.dto;

import lombok.*;

/**
 * @author 민경수
 * @description user dto
 * @since 2022.09.05
 **********************************************************************************************************************/
@Getter
@Setter
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserDto extends AbstractDto{

    private String email;

    public UserDto(Long seq, String email) {
        super(seq);
        this.email = email;
    }

}