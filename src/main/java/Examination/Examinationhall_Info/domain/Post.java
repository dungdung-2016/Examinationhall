package Examination.Examinationhall_Info.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Post extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name ="post_id")
    private Long id;

    private String content;

    private String picture;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")//외래키 mapping 할 때 사용.name 속성에는 mapping 할 fk 이름
    private User users;

    @OneToMany (mappedBy = "posts")
    private List<Comment> comments =new ArrayList<>();

    @OneToMany (mappedBy = "posts")
    private List<Like> likes =new ArrayList<>();


}
