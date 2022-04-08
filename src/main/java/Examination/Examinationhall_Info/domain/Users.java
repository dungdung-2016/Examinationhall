package Examination.Examinationhall_Info.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 회원(User Entity)
 */
@Entity
@Getter @Setter
public class Users extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name ="user_id")
    private Long id;

    private String username;



}
