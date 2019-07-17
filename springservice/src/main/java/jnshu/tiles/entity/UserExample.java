package jnshu.tiles.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kxp6223065
 */
public class UserExample implements Serializable {
    private static final long serialVersionUID = 1209217646188766276L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable{
        private static final long serialVersionUID = 925809060126722556L;
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(Long value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(Long value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(Long value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(Long value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(Long value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<Long> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<Long> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(Long value1, Long value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(Long value1, Long value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Long value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Long value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Long value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Long value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Long> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Long> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Long value1, Long value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(Long value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(Long value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(Long value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(Long value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(Long value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(Long value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<Long> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<Long> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(Long value1, Long value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(Long value1, Long value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMailboxIsNull() {
            addCriterion("mailbox is null");
            return (Criteria) this;
        }

        public Criteria andMailboxIsNotNull() {
            addCriterion("mailbox is not null");
            return (Criteria) this;
        }

        public Criteria andMailboxEqualTo(String value) {
            addCriterion("mailbox =", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotEqualTo(String value) {
            addCriterion("mailbox <>", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxGreaterThan(String value) {
            addCriterion("mailbox >", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("mailbox >=", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLessThan(String value) {
            addCriterion("mailbox <", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLessThanOrEqualTo(String value) {
            addCriterion("mailbox <=", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxLike(String value) {
            addCriterion("mailbox like", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotLike(String value) {
            addCriterion("mailbox not like", value, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxIn(List<String> values) {
            addCriterion("mailbox in", values, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotIn(List<String> values) {
            addCriterion("mailbox not in", values, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxBetween(String value1, String value2) {
            addCriterion("mailbox between", value1, value2, "mailbox");
            return (Criteria) this;
        }

        public Criteria andMailboxNotBetween(String value1, String value2) {
            addCriterion("mailbox not between", value1, value2, "mailbox");
            return (Criteria) this;
        }
    }

    public static class Criteria  extends GeneratedCriteria implements Serializable{

        private static final long serialVersionUID = 1196122391197635228L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable{
        private static final long serialVersionUID = 5104716231514425159L;
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}