package com.tixue.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNull() {
            addCriterion("role_code is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("role_code is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("role_code =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("role_code <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("role_code >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("role_code >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("role_code <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("role_code <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLike(String value) {
            addCriterion("role_code like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("role_code not like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("role_code in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("role_code not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("role_code between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("role_code not between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdIsNull() {
            addCriterion("role_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdIsNotNull() {
            addCriterion("role_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdEqualTo(Integer value) {
            addCriterion("role_parent_id =", value, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdNotEqualTo(Integer value) {
            addCriterion("role_parent_id <>", value, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdGreaterThan(Integer value) {
            addCriterion("role_parent_id >", value, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_parent_id >=", value, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdLessThan(Integer value) {
            addCriterion("role_parent_id <", value, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_parent_id <=", value, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdIn(List<Integer> values) {
            addCriterion("role_parent_id in", values, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdNotIn(List<Integer> values) {
            addCriterion("role_parent_id not in", values, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdBetween(Integer value1, Integer value2) {
            addCriterion("role_parent_id between", value1, value2, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_parent_id not between", value1, value2, "roleParentId");
            return (Criteria) this;
        }

        public Criteria andRoleNoteIsNull() {
            addCriterion("role_note is null");
            return (Criteria) this;
        }

        public Criteria andRoleNoteIsNotNull() {
            addCriterion("role_note is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNoteEqualTo(String value) {
            addCriterion("role_note =", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteNotEqualTo(String value) {
            addCriterion("role_note <>", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteGreaterThan(String value) {
            addCriterion("role_note >", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteGreaterThanOrEqualTo(String value) {
            addCriterion("role_note >=", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteLessThan(String value) {
            addCriterion("role_note <", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteLessThanOrEqualTo(String value) {
            addCriterion("role_note <=", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteLike(String value) {
            addCriterion("role_note like", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteNotLike(String value) {
            addCriterion("role_note not like", value, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteIn(List<String> values) {
            addCriterion("role_note in", values, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteNotIn(List<String> values) {
            addCriterion("role_note not in", values, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteBetween(String value1, String value2) {
            addCriterion("role_note between", value1, value2, "roleNote");
            return (Criteria) this;
        }

        public Criteria andRoleNoteNotBetween(String value1, String value2) {
            addCriterion("role_note not between", value1, value2, "roleNote");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeIsNull() {
            addCriterion("user_biz_type is null");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeIsNotNull() {
            addCriterion("user_biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeEqualTo(String value) {
            addCriterion("user_biz_type =", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeNotEqualTo(String value) {
            addCriterion("user_biz_type <>", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeGreaterThan(String value) {
            addCriterion("user_biz_type >", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_biz_type >=", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeLessThan(String value) {
            addCriterion("user_biz_type <", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeLessThanOrEqualTo(String value) {
            addCriterion("user_biz_type <=", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeLike(String value) {
            addCriterion("user_biz_type like", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeNotLike(String value) {
            addCriterion("user_biz_type not like", value, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeIn(List<String> values) {
            addCriterion("user_biz_type in", values, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeNotIn(List<String> values) {
            addCriterion("user_biz_type not in", values, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeBetween(String value1, String value2) {
            addCriterion("user_biz_type between", value1, value2, "userBizType");
            return (Criteria) this;
        }

        public Criteria andUserBizTypeNotBetween(String value1, String value2) {
            addCriterion("user_biz_type not between", value1, value2, "userBizType");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNull() {
            addCriterion("row_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNotNull() {
            addCriterion("row_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeEqualTo(Date value) {
            addCriterion("row_add_time =", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotEqualTo(Date value) {
            addCriterion("row_add_time <>", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThan(Date value) {
            addCriterion("row_add_time >", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_add_time >=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThan(Date value) {
            addCriterion("row_add_time <", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_add_time <=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIn(List<Date> values) {
            addCriterion("row_add_time in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotIn(List<Date> values) {
            addCriterion("row_add_time not in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeBetween(Date value1, Date value2) {
            addCriterion("row_add_time between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_add_time not between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNull() {
            addCriterion("row_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNotNull() {
            addCriterion("row_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeEqualTo(Date value) {
            addCriterion("row_update_time =", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotEqualTo(Date value) {
            addCriterion("row_update_time <>", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThan(Date value) {
            addCriterion("row_update_time >", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_update_time >=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThan(Date value) {
            addCriterion("row_update_time <", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_update_time <=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIn(List<Date> values) {
            addCriterion("row_update_time in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotIn(List<Date> values) {
            addCriterion("row_update_time not in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("row_update_time between", value1, value2, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_update_time not between", value1, value2, "rowUpdateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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