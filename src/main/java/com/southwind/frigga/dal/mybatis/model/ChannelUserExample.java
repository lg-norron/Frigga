package com.southwind.frigga.dal.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class ChannelUserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public ChannelUserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andQdLoginIsNull() {
			addCriterion("qd_login is null");
			return (Criteria) this;
		}

		public Criteria andQdLoginIsNotNull() {
			addCriterion("qd_login is not null");
			return (Criteria) this;
		}

		public Criteria andQdLoginEqualTo(String value) {
			addCriterion("qd_login =", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginNotEqualTo(String value) {
			addCriterion("qd_login <>", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginGreaterThan(String value) {
			addCriterion("qd_login >", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginGreaterThanOrEqualTo(String value) {
			addCriterion("qd_login >=", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginLessThan(String value) {
			addCriterion("qd_login <", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginLessThanOrEqualTo(String value) {
			addCriterion("qd_login <=", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginLike(String value) {
			addCriterion("qd_login like", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginNotLike(String value) {
			addCriterion("qd_login not like", value, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginIn(List<String> values) {
			addCriterion("qd_login in", values, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginNotIn(List<String> values) {
			addCriterion("qd_login not in", values, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginBetween(String value1, String value2) {
			addCriterion("qd_login between", value1, value2, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdLoginNotBetween(String value1, String value2) {
			addCriterion("qd_login not between", value1, value2, "qdLogin");
			return (Criteria) this;
		}

		public Criteria andQdPasswordIsNull() {
			addCriterion("qd_password is null");
			return (Criteria) this;
		}

		public Criteria andQdPasswordIsNotNull() {
			addCriterion("qd_password is not null");
			return (Criteria) this;
		}

		public Criteria andQdPasswordEqualTo(String value) {
			addCriterion("qd_password =", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordNotEqualTo(String value) {
			addCriterion("qd_password <>", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordGreaterThan(String value) {
			addCriterion("qd_password >", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("qd_password >=", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordLessThan(String value) {
			addCriterion("qd_password <", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordLessThanOrEqualTo(String value) {
			addCriterion("qd_password <=", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordLike(String value) {
			addCriterion("qd_password like", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordNotLike(String value) {
			addCriterion("qd_password not like", value, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordIn(List<String> values) {
			addCriterion("qd_password in", values, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordNotIn(List<String> values) {
			addCriterion("qd_password not in", values, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordBetween(String value1, String value2) {
			addCriterion("qd_password between", value1, value2, "qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdPasswordNotBetween(String value1, String value2) {
			addCriterion("qd_password not between", value1, value2,
					"qdPassword");
			return (Criteria) this;
		}

		public Criteria andQdNameIsNull() {
			addCriterion("qd_name is null");
			return (Criteria) this;
		}

		public Criteria andQdNameIsNotNull() {
			addCriterion("qd_name is not null");
			return (Criteria) this;
		}

		public Criteria andQdNameEqualTo(String value) {
			addCriterion("qd_name =", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameNotEqualTo(String value) {
			addCriterion("qd_name <>", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameGreaterThan(String value) {
			addCriterion("qd_name >", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameGreaterThanOrEqualTo(String value) {
			addCriterion("qd_name >=", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameLessThan(String value) {
			addCriterion("qd_name <", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameLessThanOrEqualTo(String value) {
			addCriterion("qd_name <=", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameLike(String value) {
			addCriterion("qd_name like", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameNotLike(String value) {
			addCriterion("qd_name not like", value, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameIn(List<String> values) {
			addCriterion("qd_name in", values, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameNotIn(List<String> values) {
			addCriterion("qd_name not in", values, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameBetween(String value1, String value2) {
			addCriterion("qd_name between", value1, value2, "qdName");
			return (Criteria) this;
		}

		public Criteria andQdNameNotBetween(String value1, String value2) {
			addCriterion("qd_name not between", value1, value2, "qdName");
			return (Criteria) this;
		}

		public Criteria andBankNameIsNull() {
			addCriterion("bank_name is null");
			return (Criteria) this;
		}

		public Criteria andBankNameIsNotNull() {
			addCriterion("bank_name is not null");
			return (Criteria) this;
		}

		public Criteria andBankNameEqualTo(String value) {
			addCriterion("bank_name =", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotEqualTo(String value) {
			addCriterion("bank_name <>", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameGreaterThan(String value) {
			addCriterion("bank_name >", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameGreaterThanOrEqualTo(String value) {
			addCriterion("bank_name >=", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLessThan(String value) {
			addCriterion("bank_name <", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLessThanOrEqualTo(String value) {
			addCriterion("bank_name <=", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameLike(String value) {
			addCriterion("bank_name like", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotLike(String value) {
			addCriterion("bank_name not like", value, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameIn(List<String> values) {
			addCriterion("bank_name in", values, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotIn(List<String> values) {
			addCriterion("bank_name not in", values, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameBetween(String value1, String value2) {
			addCriterion("bank_name between", value1, value2, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankNameNotBetween(String value1, String value2) {
			addCriterion("bank_name not between", value1, value2, "bankName");
			return (Criteria) this;
		}

		public Criteria andBankAccountIsNull() {
			addCriterion("bank_account is null");
			return (Criteria) this;
		}

		public Criteria andBankAccountIsNotNull() {
			addCriterion("bank_account is not null");
			return (Criteria) this;
		}

		public Criteria andBankAccountEqualTo(String value) {
			addCriterion("bank_account =", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotEqualTo(String value) {
			addCriterion("bank_account <>", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountGreaterThan(String value) {
			addCriterion("bank_account >", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
			addCriterion("bank_account >=", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountLessThan(String value) {
			addCriterion("bank_account <", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountLessThanOrEqualTo(String value) {
			addCriterion("bank_account <=", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountLike(String value) {
			addCriterion("bank_account like", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotLike(String value) {
			addCriterion("bank_account not like", value, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountIn(List<String> values) {
			addCriterion("bank_account in", values, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotIn(List<String> values) {
			addCriterion("bank_account not in", values, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountBetween(String value1, String value2) {
			addCriterion("bank_account between", value1, value2, "bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankAccountNotBetween(String value1, String value2) {
			addCriterion("bank_account not between", value1, value2,
					"bankAccount");
			return (Criteria) this;
		}

		public Criteria andBankUserIsNull() {
			addCriterion("bank_user is null");
			return (Criteria) this;
		}

		public Criteria andBankUserIsNotNull() {
			addCriterion("bank_user is not null");
			return (Criteria) this;
		}

		public Criteria andBankUserEqualTo(String value) {
			addCriterion("bank_user =", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserNotEqualTo(String value) {
			addCriterion("bank_user <>", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserGreaterThan(String value) {
			addCriterion("bank_user >", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserGreaterThanOrEqualTo(String value) {
			addCriterion("bank_user >=", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserLessThan(String value) {
			addCriterion("bank_user <", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserLessThanOrEqualTo(String value) {
			addCriterion("bank_user <=", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserLike(String value) {
			addCriterion("bank_user like", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserNotLike(String value) {
			addCriterion("bank_user not like", value, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserIn(List<String> values) {
			addCriterion("bank_user in", values, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserNotIn(List<String> values) {
			addCriterion("bank_user not in", values, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserBetween(String value1, String value2) {
			addCriterion("bank_user between", value1, value2, "bankUser");
			return (Criteria) this;
		}

		public Criteria andBankUserNotBetween(String value1, String value2) {
			addCriterion("bank_user not between", value1, value2, "bankUser");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table channel_user
	 * @mbggenerated  Sat Sep 13 19:27:34 CST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table channel_user
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 25 19:46:55 GMT+08:00 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}