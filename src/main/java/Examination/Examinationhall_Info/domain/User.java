package Examination.Examinationhall_Info.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * User Entity(회원 엔티티)
 */
@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue
    @Column(name ="user_id")
    private Long id;

    private String username;

    private String email; //로그인 시 id로 사용

    private String picture;

    private String password; //password 로 사용

    @OneToMany (mappedBy = "users")
    private List<Post> posts = new ArrayList<>();

    @OneToMany (mappedBy = "users")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "users")
    private List<Like> likes=new ArrayList<>();




}
