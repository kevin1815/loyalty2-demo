package com.shuyun.loalty.recognize.mapper;

import com.shuyun.loalty.recognize.vo.Member;

public interface MemberMapper {
    Member getMemberById(Long id, String tenantId);
}
