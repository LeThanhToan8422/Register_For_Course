package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.enums.StatusUser;
import vn.edu.iuh.fit.enums.TypeUser;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    private boolean gender;
    private LocalDate dob;
    private String email;
    private String phone;
    private String address;
    @Column(name = "class")
    private String classCode;
    @Column(name = "course_year")
    private String courseYear;
    @Column(name = "enroll_time")
    private LocalDate enrollTime;
    private TypeUser type;
    private StatusUser status;
    @OneToOne
    @JoinColumn(name = "department_id")
    private Department departmentId;
    @ManyToOne
    @JoinColumn(name = "course_section_study_id")
    private CourseSection courseSectionStudyId;
    @ManyToOne
    @JoinColumn(name = "course_section_teach_id")
    private CourseSection courseSectionTeachId;
    @OneToMany(mappedBy = "lectureId")
    private List<Lecture_Course_Section> lectureCourseSections;
    @OneToMany(mappedBy = "studentId")
    private List<Grades> grades;
}
