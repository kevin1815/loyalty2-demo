package com.shuyun.loalty.recognize.mapper;

import com.shuyun.loalty.recognize.vo.PlatMember;

public interface PlatMemberMapper {
    PlatMember getPlaMemberById(Long id, String tenantId);
}
