# SpringBoot & ElasticSearch 연동 예제

* springboot 2.7.12
* Gradle

## 도커
가이드 문서 : https://www.elastic.co/guide/en/kibana/7.17/docker.html

```
docker network create elastic

docker pull docker.elastic.co/elasticsearch/elasticsearch:7.17.19
docker run -d --name es01 --net elastic -p 127.0.0.1:9200:9200 -p 127.0.0.1:9300:9300 -e "discovery.type=single-node" -e "ES_JAVA_OPTS=-Xms512m -Xmx512m" docker.elastic.co/elasticsearch/elasticsearch:7.17.19


docker pull docker.elastic.co/kibana/kibana:7.17.19
docker run -d --name kibana --net elastic -p 127.0.0.1:5601:5601 -e "ELASTICSEARCH_HOSTS=http://es01:9200" docker.elastic.co/kibana/kibana:7.17.19

```


