package hello.egov001.domain.sample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter @Setter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sample {

    @Id // 이 필드가 테이블의 Primary Key(PK)임을 나타냅니다.
    @Column(nullable = false, length = 16)
    private String id;

    @Column(length = 50)
    private String name;

    @Column(length = 100)
    private String description;

    @Column(name = "USE_YN", length = 1)
    private String useYn; // CHAR(1) 타입은 String 또는 char로 매핑 가능합니다.

    @Column(name = "REG_USER", length = 10)
    private String regUser; // DB의 snake_case(REG_USER)를 Java의 camelCase(regUser)로 매핑합니다.
}