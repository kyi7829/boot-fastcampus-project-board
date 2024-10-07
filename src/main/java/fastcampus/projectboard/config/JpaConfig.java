package fastcampus.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

/**
 * 클래스 설명: Jpa설정
 *
 * @author yi782
 * @date 2024-10-07
 */
@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        // FIXME 스프링 시큐리티로 인증 기능 추가 시 수정 필요
        return () -> Optional.of("kyi");
    }
}
