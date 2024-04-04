package com.brunosong.elasticsearch_exam.shop.product.repository.basic;

import com.brunosong.elasticsearch_exam.shop.product.documents.SearchMovie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ElasticCommonProductRepositoryTest {

    @Autowired
    ElasticCommonProductRepository repository;

    @Test
    void test(){
        List<SearchMovie> list = repository.findByMovieNm("반지의 제왕3 왕의 귀환");
        System.out.println(list.get(0).getMovieNmEn());
    }

}