package p.entity;

import javax.persistence.*;

@Entity
//表名称自定义
@Table(name = "user")
public class User {
    @Id
//    产生方式：ident
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    protected User(){}
    public User(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d,firstName='%s',lastName='%s']",
                id,firstName,lastName);
    }
}
