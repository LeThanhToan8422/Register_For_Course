package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "course_sections")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "section_code")
    private String sectionCode;
    @Column(name = "student_enrollment_number")
    private Long studentEnrollmentNumber;
    @OneToMany(mappedBy = "courseSectionStudyId")
    private List<User> students;
    @OneToMany(mappedBy = "courseSectionTeachId")
    private List<User> lectures;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courseId;
    @OneToMany(mappedBy = "courseSectionId")
    private List<Lecture_Course_Section> lectureCourseSections;
    @OneToMany(mappedBy = "courseSectionId")
    private List<Grades> grades;
}
