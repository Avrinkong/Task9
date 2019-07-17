package jnshu.tiles.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kxp6223065
 */
public class ProfessionExample  implements Serializable {
    private static final long serialVersionUID = -2918994281206785543L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfessionExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 5225872750925935541L;
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

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNull() {
            addCriterion("profession is null");
            return (Criteria) this;
        }

        public Criteria andProfessionIsNotNull() {
            addCriterion("profession is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionEqualTo(String value) {
            addCriterion("profession =", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotEqualTo(String value) {
            addCriterion("profession <>", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThan(String value) {
            addCriterion("profession >", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionGreaterThanOrEqualTo(String value) {
            addCriterion("profession >=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThan(String value) {
            addCriterion("profession <", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLessThanOrEqualTo(String value) {
            addCriterion("profession <=", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionLike(String value) {
            addCriterion("profession like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotLike(String value) {
            addCriterion("profession not like", value, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionIn(List<String> values) {
            addCriterion("profession in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotIn(List<String> values) {
            addCriterion("profession not in", values, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionBetween(String value1, String value2) {
            addCriterion("profession between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andProfessionNotBetween(String value1, String value2) {
            addCriterion("profession not between", value1, value2, "profession");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("threshold is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("threshold is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(String value) {
            addCriterion("threshold =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(String value) {
            addCriterion("threshold <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(String value) {
            addCriterion("threshold >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(String value) {
            addCriterion("threshold >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(String value) {
            addCriterion("threshold <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(String value) {
            addCriterion("threshold <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLike(String value) {
            addCriterion("threshold like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotLike(String value) {
            addCriterion("threshold not like", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<String> values) {
            addCriterion("threshold in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<String> values) {
            addCriterion("threshold not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(String value1, String value2) {
            addCriterion("threshold between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(String value1, String value2) {
            addCriterion("threshold not between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(String value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(String value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(String value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(String value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(String value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLike(String value) {
            addCriterion("difficulty like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotLike(String value) {
            addCriterion("difficulty not like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<String> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<String> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(String value1, String value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(String value1, String value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("growth is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("growth is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(String value) {
            addCriterion("growth =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(String value) {
            addCriterion("growth <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(String value) {
            addCriterion("growth >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(String value) {
            addCriterion("growth >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(String value) {
            addCriterion("growth <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(String value) {
            addCriterion("growth <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLike(String value) {
            addCriterion("growth like", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotLike(String value) {
            addCriterion("growth not like", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<String> values) {
            addCriterion("growth in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<String> values) {
            addCriterion("growth not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(String value1, String value2) {
            addCriterion("growth between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(String value1, String value2) {
            addCriterion("growth not between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andScarcityIsNull() {
            addCriterion("scarcity is null");
            return (Criteria) this;
        }

        public Criteria andScarcityIsNotNull() {
            addCriterion("scarcity is not null");
            return (Criteria) this;
        }

        public Criteria andScarcityEqualTo(Integer value) {
            addCriterion("scarcity =", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityNotEqualTo(Integer value) {
            addCriterion("scarcity <>", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityGreaterThan(Integer value) {
            addCriterion("scarcity >", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityGreaterThanOrEqualTo(Integer value) {
            addCriterion("scarcity >=", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityLessThan(Integer value) {
            addCriterion("scarcity <", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityLessThanOrEqualTo(Integer value) {
            addCriterion("scarcity <=", value, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityIn(List<Integer> values) {
            addCriterion("scarcity in", values, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityNotIn(List<Integer> values) {
            addCriterion("scarcity not in", values, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityBetween(Integer value1, Integer value2) {
            addCriterion("scarcity between", value1, value2, "scarcity");
            return (Criteria) this;
        }

        public Criteria andScarcityNotBetween(Integer value1, Integer value2) {
            addCriterion("scarcity not between", value1, value2, "scarcity");
            return (Criteria) this;
        }

        public Criteria andYearoneIsNull() {
            addCriterion("yearone is null");
            return (Criteria) this;
        }

        public Criteria andYearoneIsNotNull() {
            addCriterion("yearone is not null");
            return (Criteria) this;
        }

        public Criteria andYearoneEqualTo(String value) {
            addCriterion("yearone =", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneNotEqualTo(String value) {
            addCriterion("yearone <>", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneGreaterThan(String value) {
            addCriterion("yearone >", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneGreaterThanOrEqualTo(String value) {
            addCriterion("yearone >=", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneLessThan(String value) {
            addCriterion("yearone <", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneLessThanOrEqualTo(String value) {
            addCriterion("yearone <=", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneLike(String value) {
            addCriterion("yearone like", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneNotLike(String value) {
            addCriterion("yearone not like", value, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneIn(List<String> values) {
            addCriterion("yearone in", values, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneNotIn(List<String> values) {
            addCriterion("yearone not in", values, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneBetween(String value1, String value2) {
            addCriterion("yearone between", value1, value2, "yearone");
            return (Criteria) this;
        }

        public Criteria andYearoneNotBetween(String value1, String value2) {
            addCriterion("yearone not between", value1, value2, "yearone");
            return (Criteria) this;
        }

        public Criteria andYeartwoIsNull() {
            addCriterion("yeartwo is null");
            return (Criteria) this;
        }

        public Criteria andYeartwoIsNotNull() {
            addCriterion("yeartwo is not null");
            return (Criteria) this;
        }

        public Criteria andYeartwoEqualTo(String value) {
            addCriterion("yeartwo =", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoNotEqualTo(String value) {
            addCriterion("yeartwo <>", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoGreaterThan(String value) {
            addCriterion("yeartwo >", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoGreaterThanOrEqualTo(String value) {
            addCriterion("yeartwo >=", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoLessThan(String value) {
            addCriterion("yeartwo <", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoLessThanOrEqualTo(String value) {
            addCriterion("yeartwo <=", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoLike(String value) {
            addCriterion("yeartwo like", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoNotLike(String value) {
            addCriterion("yeartwo not like", value, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoIn(List<String> values) {
            addCriterion("yeartwo in", values, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoNotIn(List<String> values) {
            addCriterion("yeartwo not in", values, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoBetween(String value1, String value2) {
            addCriterion("yeartwo between", value1, value2, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYeartwoNotBetween(String value1, String value2) {
            addCriterion("yeartwo not between", value1, value2, "yeartwo");
            return (Criteria) this;
        }

        public Criteria andYearthreeIsNull() {
            addCriterion("yearthree is null");
            return (Criteria) this;
        }

        public Criteria andYearthreeIsNotNull() {
            addCriterion("yearthree is not null");
            return (Criteria) this;
        }

        public Criteria andYearthreeEqualTo(String value) {
            addCriterion("yearthree =", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeNotEqualTo(String value) {
            addCriterion("yearthree <>", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeGreaterThan(String value) {
            addCriterion("yearthree >", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeGreaterThanOrEqualTo(String value) {
            addCriterion("yearthree >=", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeLessThan(String value) {
            addCriterion("yearthree <", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeLessThanOrEqualTo(String value) {
            addCriterion("yearthree <=", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeLike(String value) {
            addCriterion("yearthree like", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeNotLike(String value) {
            addCriterion("yearthree not like", value, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeIn(List<String> values) {
            addCriterion("yearthree in", values, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeNotIn(List<String> values) {
            addCriterion("yearthree not in", values, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeBetween(String value1, String value2) {
            addCriterion("yearthree between", value1, value2, "yearthree");
            return (Criteria) this;
        }

        public Criteria andYearthreeNotBetween(String value1, String value2) {
            addCriterion("yearthree not between", value1, value2, "yearthree");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleIsNull() {
            addCriterion("learnpeople is null");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleIsNotNull() {
            addCriterion("learnpeople is not null");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleEqualTo(Integer value) {
            addCriterion("learnpeople =", value, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleNotEqualTo(Integer value) {
            addCriterion("learnpeople <>", value, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleGreaterThan(Integer value) {
            addCriterion("learnpeople >", value, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnpeople >=", value, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleLessThan(Integer value) {
            addCriterion("learnpeople <", value, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("learnpeople <=", value, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleIn(List<Integer> values) {
            addCriterion("learnpeople in", values, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleNotIn(List<Integer> values) {
            addCriterion("learnpeople not in", values, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleBetween(Integer value1, Integer value2) {
            addCriterion("learnpeople between", value1, value2, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andLearnpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("learnpeople not between", value1, value2, "learnpeople");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("createat is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("createat is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Long value) {
            addCriterion("createat =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Long value) {
            addCriterion("createat <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Long value) {
            addCriterion("createat >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Long value) {
            addCriterion("createat >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Long value) {
            addCriterion("createat <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Long value) {
            addCriterion("createat <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Long> values) {
            addCriterion("createat in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Long> values) {
            addCriterion("createat not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Long value1, Long value2) {
            addCriterion("createat between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Long value1, Long value2) {
            addCriterion("createat not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNull() {
            addCriterion("updateat is null");
            return (Criteria) this;
        }

        public Criteria andUpdateatIsNotNull() {
            addCriterion("updateat is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateatEqualTo(Long value) {
            addCriterion("updateat =", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotEqualTo(Long value) {
            addCriterion("updateat <>", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThan(Long value) {
            addCriterion("updateat >", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatGreaterThanOrEqualTo(Long value) {
            addCriterion("updateat >=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThan(Long value) {
            addCriterion("updateat <", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatLessThanOrEqualTo(Long value) {
            addCriterion("updateat <=", value, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatIn(List<Long> values) {
            addCriterion("updateat in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotIn(List<Long> values) {
            addCriterion("updateat not in", values, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatBetween(Long value1, Long value2) {
            addCriterion("updateat between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andUpdateatNotBetween(Long value1, Long value2) {
            addCriterion("updateat not between", value1, value2, "updateat");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable{

        private static final long serialVersionUID = 3150625012581585109L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable{
        private static final long serialVersionUID = 8328949677246056970L;
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