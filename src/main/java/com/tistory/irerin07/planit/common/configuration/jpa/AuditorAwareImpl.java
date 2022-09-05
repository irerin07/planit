package com.tistory.irerin07.planit.common.configuration.jpa;

/**
 * @author 민경수
 * @description audit aware impl
 * @since 2022.09.05
 **********************************************************************************************************************/
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        try {
            return Optional.of(SecurityContextHolder.getContext().getAuthentication().getName());
        } catch (Exception e) {
            return Optional.of("anonymous");
        }
    }

}
