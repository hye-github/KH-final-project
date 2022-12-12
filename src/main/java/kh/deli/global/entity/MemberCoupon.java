package kh.deli.global.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberCoupon {
    private int mc_seq;
    private int cp_seq;
    private int acc_seq;
    Timestamp mc_issue_date;
    Timestamp mc_deadline;
}
