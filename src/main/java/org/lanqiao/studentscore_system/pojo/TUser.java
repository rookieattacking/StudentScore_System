package org.lanqiao.studentscore_system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser {
  private long userId;
  private String userName;
  private String passWord;
}
