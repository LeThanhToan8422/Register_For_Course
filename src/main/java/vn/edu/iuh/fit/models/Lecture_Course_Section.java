package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.IdClass.Lecture_Course_Section_Id;
import vn.edu.iuh.fit.enums.Classes;

@Entity
@Table(name = "lecture_course_sections")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@IdClass(Lecture_Course_Section_Id.class)
public class Lecture_Course_Section {
    @Id
    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private User lectureId;
    @Id
    @ManyToOne
    @JoinColumn(name = "course_section_id")
    private CourseSection courseSectionId;
    private Classes clss;
}
