package com.brunosong.elasticsearch_exam.shop.product.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(indexName = "movie")
public class SearchProduct {

    @Id
    @Field(name = "movieCd", type = FieldType.Integer)
    private Integer movieCd;

    @Field(name = "movieNm", type = FieldType.Text)
    private String movieNm;

    @Field(name = "movieNmEn", type = FieldType.Text)
    private String movieNmEn;

    @Field(name = "prdtYear", type = FieldType.Integer)
    private Integer prdtYear;

    @Field(name = "repNationNm", type = FieldType.Keyword)
    private String repNationNm;

    @Field(name = "regGenreNm", type = FieldType.Keyword)
    private String regGenreNm;

}
