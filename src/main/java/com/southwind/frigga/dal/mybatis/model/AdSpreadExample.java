package com.southwind.frigga.dal.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class AdSpreadExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public AdSpreadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Long value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Long value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Long value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Long value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Long> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Long> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Long value1, Long value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andQdIdIsNull() {
            addCriterion("qd_id is null");
            return (Criteria) this;
        }

        public Criteria andQdIdIsNotNull() {
            addCriterion("qd_id is not null");
            return (Criteria) this;
        }

        public Criteria andQdIdEqualTo(Long value) {
            addCriterion("qd_id =", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdNotEqualTo(Long value) {
            addCriterion("qd_id <>", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdGreaterThan(Long value) {
            addCriterion("qd_id >", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("qd_id >=", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdLessThan(Long value) {
            addCriterion("qd_id <", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdLessThanOrEqualTo(Long value) {
            addCriterion("qd_id <=", value, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdIn(List<Long> values) {
            addCriterion("qd_id in", values, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdNotIn(List<Long> values) {
            addCriterion("qd_id not in", values, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdBetween(Long value1, Long value2) {
            addCriterion("qd_id between", value1, value2, "qdId");
            return (Criteria) this;
        }

        public Criteria andQdIdNotBetween(Long value1, Long value2) {
            addCriterion("qd_id not between", value1, value2, "qdId");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andRebatePropIsNull() {
            addCriterion("rebate_prop is null");
            return (Criteria) this;
        }

        public Criteria andRebatePropIsNotNull() {
            addCriterion("rebate_prop is not null");
            return (Criteria) this;
        }

        public Criteria andRebatePropEqualTo(Integer value) {
            addCriterion("rebate_prop =", value, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropNotEqualTo(Integer value) {
            addCriterion("rebate_prop <>", value, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropGreaterThan(Integer value) {
            addCriterion("rebate_prop >", value, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebate_prop >=", value, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropLessThan(Integer value) {
            addCriterion("rebate_prop <", value, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropLessThanOrEqualTo(Integer value) {
            addCriterion("rebate_prop <=", value, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropIn(List<Integer> values) {
            addCriterion("rebate_prop in", values, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropNotIn(List<Integer> values) {
            addCriterion("rebate_prop not in", values, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropBetween(Integer value1, Integer value2) {
            addCriterion("rebate_prop between", value1, value2, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebatePropNotBetween(Integer value1, Integer value2) {
            addCriterion("rebate_prop not between", value1, value2, "rebateProp");
            return (Criteria) this;
        }

        public Criteria andRebateSinceIsNull() {
            addCriterion("rebate_since is null");
            return (Criteria) this;
        }

        public Criteria andRebateSinceIsNotNull() {
            addCriterion("rebate_since is not null");
            return (Criteria) this;
        }

        public Criteria andRebateSinceEqualTo(Integer value) {
            addCriterion("rebate_since =", value, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceNotEqualTo(Integer value) {
            addCriterion("rebate_since <>", value, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceGreaterThan(Integer value) {
            addCriterion("rebate_since >", value, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebate_since >=", value, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceLessThan(Integer value) {
            addCriterion("rebate_since <", value, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceLessThanOrEqualTo(Integer value) {
            addCriterion("rebate_since <=", value, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceIn(List<Integer> values) {
            addCriterion("rebate_since in", values, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceNotIn(List<Integer> values) {
            addCriterion("rebate_since not in", values, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceBetween(Integer value1, Integer value2) {
            addCriterion("rebate_since between", value1, value2, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceNotBetween(Integer value1, Integer value2) {
            addCriterion("rebate_since not between", value1, value2, "rebateSince");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagIsNull() {
            addCriterion("rebate_since_flag is null");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagIsNotNull() {
            addCriterion("rebate_since_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagEqualTo(Byte value) {
            addCriterion("rebate_since_flag =", value, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagNotEqualTo(Byte value) {
            addCriterion("rebate_since_flag <>", value, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagGreaterThan(Byte value) {
            addCriterion("rebate_since_flag >", value, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("rebate_since_flag >=", value, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagLessThan(Byte value) {
            addCriterion("rebate_since_flag <", value, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagLessThanOrEqualTo(Byte value) {
            addCriterion("rebate_since_flag <=", value, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagIn(List<Byte> values) {
            addCriterion("rebate_since_flag in", values, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagNotIn(List<Byte> values) {
            addCriterion("rebate_since_flag not in", values, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagBetween(Byte value1, Byte value2) {
            addCriterion("rebate_since_flag between", value1, value2, "rebateSinceFlag");
            return (Criteria) this;
        }

        public Criteria andRebateSinceFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("rebate_since_flag not between", value1, value2, "rebateSinceFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ad_spread
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ad_spread
     *
     * @mbggenerated Mon Aug 25 19:46:55 GMT+08:00 2014
     */
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