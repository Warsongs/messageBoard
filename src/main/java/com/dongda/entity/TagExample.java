package com.dongda.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TagExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andWatchnumIsNull() {
            addCriterion("watchNum is null");
            return (Criteria) this;
        }

        public Criteria andWatchnumIsNotNull() {
            addCriterion("watchNum is not null");
            return (Criteria) this;
        }

        public Criteria andWatchnumEqualTo(Integer value) {
            addCriterion("watchNum =", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotEqualTo(Integer value) {
            addCriterion("watchNum <>", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumGreaterThan(Integer value) {
            addCriterion("watchNum >", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchNum >=", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumLessThan(Integer value) {
            addCriterion("watchNum <", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumLessThanOrEqualTo(Integer value) {
            addCriterion("watchNum <=", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumIn(List<Integer> values) {
            addCriterion("watchNum in", values, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotIn(List<Integer> values) {
            addCriterion("watchNum not in", values, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumBetween(Integer value1, Integer value2) {
            addCriterion("watchNum between", value1, value2, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotBetween(Integer value1, Integer value2) {
            addCriterion("watchNum not between", value1, value2, "watchnum");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNull() {
            addCriterion("likeNum is null");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNotNull() {
            addCriterion("likeNum is not null");
            return (Criteria) this;
        }

        public Criteria andLikenumEqualTo(Integer value) {
            addCriterion("likeNum =", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotEqualTo(Integer value) {
            addCriterion("likeNum <>", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThan(Integer value) {
            addCriterion("likeNum >", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeNum >=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThan(Integer value) {
            addCriterion("likeNum <", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("likeNum <=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumIn(List<Integer> values) {
            addCriterion("likeNum in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotIn(List<Integer> values) {
            addCriterion("likeNum not in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumBetween(Integer value1, Integer value2) {
            addCriterion("likeNum between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("likeNum not between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andTagBgIsNull() {
            addCriterion("tag_bg is null");
            return (Criteria) this;
        }

        public Criteria andTagBgIsNotNull() {
            addCriterion("tag_bg is not null");
            return (Criteria) this;
        }

        public Criteria andTagBgEqualTo(String value) {
            addCriterion("tag_bg =", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgNotEqualTo(String value) {
            addCriterion("tag_bg <>", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgGreaterThan(String value) {
            addCriterion("tag_bg >", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgGreaterThanOrEqualTo(String value) {
            addCriterion("tag_bg >=", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgLessThan(String value) {
            addCriterion("tag_bg <", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgLessThanOrEqualTo(String value) {
            addCriterion("tag_bg <=", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgLike(String value) {
            addCriterion("tag_bg like", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgNotLike(String value) {
            addCriterion("tag_bg not like", value, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgIn(List<String> values) {
            addCriterion("tag_bg in", values, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgNotIn(List<String> values) {
            addCriterion("tag_bg not in", values, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgBetween(String value1, String value2) {
            addCriterion("tag_bg between", value1, value2, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagBgNotBetween(String value1, String value2) {
            addCriterion("tag_bg not between", value1, value2, "tagBg");
            return (Criteria) this;
        }

        public Criteria andTagTitleIsNull() {
            addCriterion("tag_title is null");
            return (Criteria) this;
        }

        public Criteria andTagTitleIsNotNull() {
            addCriterion("tag_title is not null");
            return (Criteria) this;
        }

        public Criteria andTagTitleEqualTo(String value) {
            addCriterion("tag_title =", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleNotEqualTo(String value) {
            addCriterion("tag_title <>", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleGreaterThan(String value) {
            addCriterion("tag_title >", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tag_title >=", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleLessThan(String value) {
            addCriterion("tag_title <", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleLessThanOrEqualTo(String value) {
            addCriterion("tag_title <=", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleLike(String value) {
            addCriterion("tag_title like", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleNotLike(String value) {
            addCriterion("tag_title not like", value, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleIn(List<String> values) {
            addCriterion("tag_title in", values, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleNotIn(List<String> values) {
            addCriterion("tag_title not in", values, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleBetween(String value1, String value2) {
            addCriterion("tag_title between", value1, value2, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagTitleNotBetween(String value1, String value2) {
            addCriterion("tag_title not between", value1, value2, "tagTitle");
            return (Criteria) this;
        }

        public Criteria andTagImageIsNull() {
            addCriterion("tag_image is null");
            return (Criteria) this;
        }

        public Criteria andTagImageIsNotNull() {
            addCriterion("tag_image is not null");
            return (Criteria) this;
        }

        public Criteria andTagImageEqualTo(String value) {
            addCriterion("tag_image =", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageNotEqualTo(String value) {
            addCriterion("tag_image <>", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageGreaterThan(String value) {
            addCriterion("tag_image >", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageGreaterThanOrEqualTo(String value) {
            addCriterion("tag_image >=", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageLessThan(String value) {
            addCriterion("tag_image <", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageLessThanOrEqualTo(String value) {
            addCriterion("tag_image <=", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageLike(String value) {
            addCriterion("tag_image like", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageNotLike(String value) {
            addCriterion("tag_image not like", value, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageIn(List<String> values) {
            addCriterion("tag_image in", values, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageNotIn(List<String> values) {
            addCriterion("tag_image not in", values, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageBetween(String value1, String value2) {
            addCriterion("tag_image between", value1, value2, "tagImage");
            return (Criteria) this;
        }

        public Criteria andTagImageNotBetween(String value1, String value2) {
            addCriterion("tag_image not between", value1, value2, "tagImage");
            return (Criteria) this;
        }

        public Criteria andAnnoIsNull() {
            addCriterion("anno is null");
            return (Criteria) this;
        }

        public Criteria andAnnoIsNotNull() {
            addCriterion("anno is not null");
            return (Criteria) this;
        }

        public Criteria andAnnoEqualTo(Integer value) {
            addCriterion("anno =", value, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoNotEqualTo(Integer value) {
            addCriterion("anno <>", value, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoGreaterThan(Integer value) {
            addCriterion("anno >", value, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("anno >=", value, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoLessThan(Integer value) {
            addCriterion("anno <", value, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoLessThanOrEqualTo(Integer value) {
            addCriterion("anno <=", value, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoIn(List<Integer> values) {
            addCriterion("anno in", values, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoNotIn(List<Integer> values) {
            addCriterion("anno not in", values, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoBetween(Integer value1, Integer value2) {
            addCriterion("anno between", value1, value2, "anno");
            return (Criteria) this;
        }

        public Criteria andAnnoNotBetween(Integer value1, Integer value2) {
            addCriterion("anno not between", value1, value2, "anno");
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