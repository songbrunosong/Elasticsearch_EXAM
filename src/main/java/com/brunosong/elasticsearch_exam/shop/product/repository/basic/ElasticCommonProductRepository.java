package com.brunosong.elasticsearch_exam.shop.product.repository.basic;

import com.brunosong.elasticsearch_exam.shop.product.documents.SearchMovie;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.Optional;

public interface ElasticCommonProductRepository extends ElasticsearchRepository<SearchMovie,Integer> {

    List<SearchMovie> findByMovieNm(String MovieNm);

    Optional<SearchMovie> findById(Integer movieCd);

}
