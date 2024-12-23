package org.lanqiao.studentscore_system.dto.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentList {
    private long studentNo;
    private String studentName;
    private String studentSex;
}
