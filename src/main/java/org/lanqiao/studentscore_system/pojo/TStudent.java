package org.lanqiao.studentscore_system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TStudent {

  private long studentNo;
  private String studentName;
  private String studentSex;
  private String stuPass;

}
