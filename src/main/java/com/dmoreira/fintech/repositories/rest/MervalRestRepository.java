package com.dmoreira.fintech.repositories.rest;

import com.dmoreira.fintech.domains.Bond;
import com.dmoreira.fintech.domains.mappers.HtmlBondMapper;
import com.dmoreira.fintech.domains.mappers.HtmlStockMapper;
import com.dmoreira.fintech.domains.Stock;
import com.vaadin.external.org.slf4j.Logger;
import com.vaadin.external.org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by diego.moreira on 11/7/2016.
 */
public class MervalRestRepository {

    final Logger logger = LoggerFactory.getLogger(MervalRestRepository.class);
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HtmlStockMapper htmlStockMapper;
    @Autowired
    private HtmlBondMapper htmlBondMapper;
    private String host;
    private String loginPath;
    private String topStocksPath;
    private String topBondsPath;

    MervalConnection mervalConnection;

    public MervalRestRepository() {

    }

    public MervalRestRepository(String host, String loginPath, String topStocksPath,
                                String topBondsPath ,String token, RestTemplate restTemplate) {
        this.host = host;
        this.loginPath = loginPath;
        this.topStocksPath = topStocksPath;
        this.topBondsPath = topBondsPath;
        this.restTemplate = restTemplate;
        this.mervalConnection = login(token);
    }

    public MervalConnection login(String token) {

        MervalConnection connection = null;

        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Accept", "*/*");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(host)
                .path(loginPath)
                .queryParam("token",token);

        final HttpEntity entity = new HttpEntity(httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            connection = new MervalConnection();
            connection.setCookies(response.getHeaders().get("Set-Cookie"));
            connection.setState("ACTIVE");
            logger.info("[Connected to Merval]");
        } else {

        }
        return connection;
    }

    public List<Stock> getTopStockQuotes() {

        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Accept", "*/*");
        httpHeaders.put("Cookie", mervalConnection.getCookies());

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(host)
                .path(topStocksPath);

        final HttpEntity entity = new HttpEntity(httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            logger.info("[Stock Quotes retrieved]");
            return htmlStockMapper.unmarshall(response.getBody());
        } else {
            return null;
        }
    }


    public List<Bond> getTopBondQuotes() {

        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Accept", "*/*");
        httpHeaders.put("Cookie", mervalConnection.getCookies());

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(host)
                .path(topBondsPath);

        final HttpEntity entity = new HttpEntity(httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            logger.info("[Bond Quotes retrieved]");
            return htmlBondMapper.unmarshall(response.getBody());
        } else {
            return null;
        }
    }

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
    }

    public void setTopStocksPath(String topStocksPath) {
        this.topStocksPath = topStocksPath;
    }

    public void setTopBondsPath(String topBondsPath) {
        this.topBondsPath = topBondsPath;
    }

    public void setMervalConnection(MervalConnection mervalConnection) {
        this.mervalConnection = mervalConnection;
    }

    public MervalConnection getMervalConnection() {
        return mervalConnection;
    }
}
