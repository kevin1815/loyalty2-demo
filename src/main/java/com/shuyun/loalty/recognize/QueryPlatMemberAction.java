package com.shuyun.loalty.recognize;

import com.shuyun.loalty.recognize.mapper.MemberMapper;
import com.shuyun.loalty.recognize.vo.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

public class QueryPlatMemberAction extends BaseAction {

    private MemberMapper memberMapper;

    private JdbcTemplate jdbcTemplate;

    private Logger logger = LoggerFactory.getLogger(getClass());

    public QueryPlatMemberAction(String componentId) {
        super(componentId);
    }

    @Override
    public void prepare(ProcessContext context) {
        super.prepare(context);
        this.memberMapper = context.getBean(MemberMapper.class);
        this.jdbcTemplate = context.getBean(JdbcTemplate.class);
    }

    public void execute() {
        Long memberId = (Long) getVariable("memberId");
        String tenantId = context.getRegInfo().getTenantId();
        Member member = this.memberMapper.getMemberById(memberId, tenantId);
        setVariable("member", member);
        String sql = "select count(1) from t_map";
        Long count = jdbcTemplate.queryForObject(sql, Long.class);
        logger.info("count = {}", count);
    }

}
