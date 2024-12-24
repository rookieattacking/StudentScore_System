package org.lanqiao.studentscore_system.vo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVo {
    private long studentNo;
    private String studentName;
    private String studentSex;
}
