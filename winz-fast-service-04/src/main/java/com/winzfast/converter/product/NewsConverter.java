package com.winzfast.converter.product;

import com.winzfast.dto.payload.response.product.NewsResponse;
import com.winzfast.entity.Product;
import com.winzfast.entity.Specification;
import org.springframework.stereotype.Component;

@Component
public class NewsConverter {
    public NewsResponse getNewsResponseDTO(Product product, Specification specification) {
        NewsResponse newsResponse = new NewsResponse();
        newsResponse.setTitle(product.getTitle());
        newsResponse.setThumbnail(product.getThumbnail());
        newsResponse.setPrice(product.getPrice());
        newsResponse.setView(product.getView());
        newsResponse.setProductDate(product.getProductDate());
//        newsResponse.setUser(product.getUser().getId());
        newsResponse.setBrand(specification.getBrand());
        newsResponse.setCarModel(specification.getCarModel());
        newsResponse.setEngine(specification.getEngine());
        newsResponse.setYear(specification.getYear());
        newsResponse.setFuel(specification.getFuel());
        newsResponse.setOrigin(specification.getOrigin());
        newsResponse.setGear(specification.getGear());
        newsResponse.setNumberOfSeat(specification.getNumberOfSeat());
        newsResponse.setProduct(specification.getProduct().getId());
        newsResponse.setMessage("Create news successfully!");
        return newsResponse;
    }
}
