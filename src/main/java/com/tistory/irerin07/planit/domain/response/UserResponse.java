package com.tistory.irerin07.planit.domain.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.querydsl.core.annotations.QueryProjection;
import com.tistory.irerin07.planit.domain.dto.UserDto;
import com.tistory.irerin07.planit.domain.entity.User;
import lombok.*;

/**
 * @author 민경수
 * @description user response
 * @since 2022.09.05
 **********************************************************************************************************************/
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_ABSENT, content = JsonInclude.Include.NON_EMPTY)
public class UserResponse extends UserDto {

    private static final long serialVersionUID = 658272555791043261L;

    public UserResponse(Long seq, String email) {
        super(seq, email);
    }

    @Builder
    @QueryProjection
    public UserResponse(User user) {
        this(user.getSeq(), user.getEmail());
    }

}