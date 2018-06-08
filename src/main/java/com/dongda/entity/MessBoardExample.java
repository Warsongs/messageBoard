package com.dongda.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessBoardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessBoardExample() {
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

        public Criteria andMsbdIdIsNull() {
            addCriterion("msbd_id is null");
            return (Criteria) this;
        }

        public Criteria andMsbdIdIsNotNull() {
            addCriterion("msbd_id is not null");
            return (Criteria) this;
        }

        public Criteria andMsbdIdEqualTo(Integer value) {
            addCriterion("msbd_id =", value, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdNotEqualTo(Integer value) {
            addCriterion("msbd_id <>", value, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdGreaterThan(Integer value) {
            addCriterion("msbd_id >", value, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("msbd_id >=", value, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdLessThan(Integer value) {
            addCriterion("msbd_id <", value, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdLessThanOrEqualTo(Integer value) {
            addCriterion("msbd_id <=", value, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdIn(List<Integer> values) {
            addCriterion("msbd_id in", values, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdNotIn(List<Integer> values) {
            addCriterion("msbd_id not in", values, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdBetween(Integer value1, Integer value2) {
            addCriterion("msbd_id between", value1, value2, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("msbd_id not between", value1, value2, "msbdId");
            return (Criteria) this;
        }

        public Criteria andMsbdNameIsNull() {
            addCriterion("msbd_name is null");
            return (Criteria) this;
        }

        public Criteria andMsbdNameIsNotNull() {
            addCriterion("msbd_name is not null");
            return (Criteria) this;
        }

        public Criteria andMsbdNameEqualTo(String value) {
            addCriterion("msbd_name =", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameNotEqualTo(String value) {
            addCriterion("msbd_name <>", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameGreaterThan(String value) {
            addCriterion("msbd_name >", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameGreaterThanOrEqualTo(String value) {
            addCriterion("msbd_name >=", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameLessThan(String value) {
            addCriterion("msbd_name <", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameLessThanOrEqualTo(String value) {
            addCriterion("msbd_name <=", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameLike(String value) {
            addCriterion("msbd_name like", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameNotLike(String value) {
            addCriterion("msbd_name not like", value, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameIn(List<String> values) {
            addCriterion("msbd_name in", values, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameNotIn(List<String> values) {
            addCriterion("msbd_name not in", values, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameBetween(String value1, String value2) {
            addCriterion("msbd_name between", value1, value2, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdNameNotBetween(String value1, String value2) {
            addCriterion("msbd_name not between", value1, value2, "msbdName");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroIsNull() {
            addCriterion("msbd_intro is null");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroIsNotNull() {
            addCriterion("msbd_intro is not null");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroEqualTo(String value) {
            addCriterion("msbd_intro =", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroNotEqualTo(String value) {
            addCriterion("msbd_intro <>", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroGreaterThan(String value) {
            addCriterion("msbd_intro >", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroGreaterThanOrEqualTo(String value) {
            addCriterion("msbd_intro >=", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroLessThan(String value) {
            addCriterion("msbd_intro <", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroLessThanOrEqualTo(String value) {
            addCriterion("msbd_intro <=", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroLike(String value) {
            addCriterion("msbd_intro like", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroNotLike(String value) {
            addCriterion("msbd_intro not like", value, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroIn(List<String> values) {
            addCriterion("msbd_intro in", values, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroNotIn(List<String> values) {
            addCriterion("msbd_intro not in", values, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroBetween(String value1, String value2) {
            addCriterion("msbd_intro between", value1, value2, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andMsbdIntroNotBetween(String value1, String value2) {
            addCriterion("msbd_intro not between", value1, value2, "msbdIntro");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexIsNull() {
            addCriterion("msbd_bg_index is null");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexIsNotNull() {
            addCriterion("msbd_bg_index is not null");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexEqualTo(Integer value) {
            addCriterion("msbd_bg_index =", value, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexNotEqualTo(Integer value) {
            addCriterion("msbd_bg_index <>", value, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexGreaterThan(Integer value) {
            addCriterion("msbd_bg_index >", value, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("msbd_bg_index >=", value, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexLessThan(Integer value) {
            addCriterion("msbd_bg_index <", value, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexLessThanOrEqualTo(Integer value) {
            addCriterion("msbd_bg_index <=", value, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexIn(List<Integer> values) {
            addCriterion("msbd_bg_index in", values, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexNotIn(List<Integer> values) {
            addCriterion("msbd_bg_index not in", values, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexBetween(Integer value1, Integer value2) {
            addCriterion("msbd_bg_index between", value1, value2, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("msbd_bg_index not between", value1, value2, "msbdBgIndex");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIsNull() {
            addCriterion("msbd_bg is null");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIsNotNull() {
            addCriterion("msbd_bg is not null");
            return (Criteria) this;
        }

        public Criteria andMsbdBgEqualTo(String value) {
            addCriterion("msbd_bg =", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgNotEqualTo(String value) {
            addCriterion("msbd_bg <>", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgGreaterThan(String value) {
            addCriterion("msbd_bg >", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgGreaterThanOrEqualTo(String value) {
            addCriterion("msbd_bg >=", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgLessThan(String value) {
            addCriterion("msbd_bg <", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgLessThanOrEqualTo(String value) {
            addCriterion("msbd_bg <=", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgLike(String value) {
            addCriterion("msbd_bg like", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgNotLike(String value) {
            addCriterion("msbd_bg not like", value, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgIn(List<String> values) {
            addCriterion("msbd_bg in", values, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgNotIn(List<String> values) {
            addCriterion("msbd_bg not in", values, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgBetween(String value1, String value2) {
            addCriterion("msbd_bg between", value1, value2, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdBgNotBetween(String value1, String value2) {
            addCriterion("msbd_bg not between", value1, value2, "msbdBg");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeIsNull() {
            addCriterion("msbd_type is null");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeIsNotNull() {
            addCriterion("msbd_type is not null");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeEqualTo(Integer value) {
            addCriterion("msbd_type =", value, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeNotEqualTo(Integer value) {
            addCriterion("msbd_type <>", value, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeGreaterThan(Integer value) {
            addCriterion("msbd_type >", value, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("msbd_type >=", value, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeLessThan(Integer value) {
            addCriterion("msbd_type <", value, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("msbd_type <=", value, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeIn(List<Integer> values) {
            addCriterion("msbd_type in", values, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeNotIn(List<Integer> values) {
            addCriterion("msbd_type not in", values, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeBetween(Integer value1, Integer value2) {
            addCriterion("msbd_type between", value1, value2, "msbdType");
            return (Criteria) this;
        }

        public Criteria andMsbdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("msbd_type not between", value1, value2, "msbdType");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
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