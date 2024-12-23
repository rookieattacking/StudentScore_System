package org.lanqiao.studentscore_system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TScore {

  private long scoreId;
  private long scoreValue;
  private String scoreType;
  private long studentId;


}
