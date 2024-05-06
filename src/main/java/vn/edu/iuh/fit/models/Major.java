package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "majors")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "major_code")
    private String majorCode;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department departmentId;
    @OneToMany(mappedBy = "majorId")
    private List<Course> courses;
}
