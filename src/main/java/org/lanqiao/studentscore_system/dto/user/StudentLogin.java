package org.lanqiao.studentscore_system.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentLogin {
    private String studentNo;
    private String password;
}
