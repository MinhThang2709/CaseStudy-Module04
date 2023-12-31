package com.winzfast.service;

import com.winzfast.dto.payload.request.product.NewsRequest;
import com.winzfast.dto.payload.response.product.NewsResponse;
import com.winzfast.dto.payload.response.Response;
import com.winzfast.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NewsService {
    List<Product> getAllNews();

    NewsResponse createNews(NewsRequest newsRequest);

    Response delete(Long id);

}
