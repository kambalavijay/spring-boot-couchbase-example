package com.javatechie.couchbase.api.repository;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.javatechie.couchbase.api.model.Beer;

@N1qlPrimaryIndexed
@ViewIndexed(designDoc="beer-sample",viewName="all")
public interface BeerRepository extends CouchbaseRepository<Beer, String>{

}
