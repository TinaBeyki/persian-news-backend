package com.beyki.service.common.dynamicquery;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SearchSpecification<T> implements Specification<T> {

    private List<SearchCriteria> searchCriteriaList;

    public SearchSpecification() {
        searchCriteriaList = new ArrayList<SearchCriteria>();
    }

    public void add(SearchCriteria criteria) {
        searchCriteriaList.add(criteria);
    }

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

        List<Predicate> predicates = new ArrayList<Predicate>();
        for(SearchCriteria criteria: searchCriteriaList) {

            if(criteria.getSearchOperation().equals(SearchOperation.GREATER_THAN)) {
                predicates.add(criteriaBuilder.greaterThan(
                        root.<String >get(criteria.getKey()), criteria.getValue().toString())
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.GREATER_THAN_EQUAL)) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(
                        root.<String>get(criteria.getKey()), criteria.getValue().toString())
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.LESS_THAN)) {
                predicates.add(criteriaBuilder.lessThan(
                        root.<String >get(criteria.getKey()), criteria.getValue().toString())
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.LESS_THAN_EQUAL)) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(
                        root.<String>get(criteria.getKey()), criteria.getValue().toString())
                );
            }
            if(criteria.getSearchOperation().equals(SearchOperation.EQUAL)) {
                predicates.add(criteriaBuilder.equal(
                        root.get(criteria.getKey()), criteria.getValue().toString())
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.MATCH_START)) {
                predicates.add(criteriaBuilder.like(
                        root.<String>get(criteria.getKey()), "%" + criteria.getValue().toString().toLowerCase())
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.MATCH_END)) {
                predicates.add(criteriaBuilder.like(
                        root.<String>get(criteria.getKey()), criteria.getValue().toString().toLowerCase() + "%")
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.MATCH)) {
                predicates.add(criteriaBuilder.like(
                        root.<String>get(criteria.getKey()), "%" + criteria.getValue().toString().toLowerCase() + "%")
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.IN)) {
                predicates.add(criteriaBuilder.in(
                        root.get(criteria.getKey())).value(criteria.getValue())
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.NOT_IN)) {
                predicates.add(criteriaBuilder.not(
                        root.<Boolean>get(criteria.getKey())).in(criteria.getValue())
                );
            }else if(criteria.getSearchOperation().equals(SearchOperation.NOT_EQUAL)) {
                predicates.add(criteriaBuilder.notEqual(
                        root.get(criteria.getKey()), criteria.getValue().toString())
                );
            }
        }
        return criteriaBuilder.or(predicates.toArray(new Predicate[0]));
    }
}
