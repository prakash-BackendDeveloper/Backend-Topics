package com.demo1.productservices.services;

import com.demo1.productservices.dto.FakeStoreDto;
import com.demo1.productservices.exceptions.productNotFoundException;
import com.demo1.productservices.models.Category;
import com.demo1.productservices.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpMessageConverterExtractor;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductService {

    RestTemplate restTemplate;
    RestTemplateBuilder restTemplateBuilder;

    public FakeStoreProductService(RestTemplate restTemplate, RestTemplateBuilder restTemplateBuilder){
        this.restTemplate=restTemplate;
        this.restTemplateBuilder=restTemplateBuilder;
    }

    @Override
    public Product getSingleProduct(long id) throws productNotFoundException {
        //RestTemplate restTemplate = new RestTemplate();

//        throw new RuntimeException("Something went wrong in Service");

//        Product a =null;
//        try {
//            throw new RuntimeException();
//        }
//        catch(Exception e){
//           return a ;
//        }

        //throw new ArithmeticException();

        FakeStoreDto fakeStoreDto=restTemplate.getForObject("https://fakestoreapi.com/products/"+id,
                FakeStoreDto.class);

        if(fakeStoreDto==null){
           throw new productNotFoundException("Given productid not valid");
        }
        return convertFakeStoreDtoToProduct(fakeStoreDto);
    }

    @Override
    public List<Product> getAllProduct() {
        //RestTemplate restTemplate=new RestTemplate();
        FakeStoreDto[] fakeStoreDto = restTemplate.getForObject("https://fakestoreapi.com/products",
                FakeStoreDto[].class);

        List<Product> products=new ArrayList<>();
        for(FakeStoreDto fakeStoreDto1:fakeStoreDto){
            products.add(convertFakeStoreDtoToProduct(fakeStoreDto1));
        }
        return products;
    }

    @Override
    public Product updateProduct(long id, Product product) {

        RequestCallback requestCallback = restTemplate.httpEntityCallback(product, FakeStoreDto.class);

       HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
       restTemplate.setRequestFactory(requestFactory);

        HttpMessageConverterExtractor<FakeStoreDto> responseExtractor =
                new HttpMessageConverterExtractor(FakeStoreDto.class, restTemplate.getMessageConverters());
        FakeStoreDto response = restTemplate.execute("https://fakestoreapi.com/products/" + id,
                HttpMethod.PATCH, requestCallback, responseExtractor);
        return convertFakeStoreDtoToProduct(response);



    }

    @Override
    public Product ReplaceProduct(long id, Product product) {
        RequestCallback requestCallback = restTemplate.httpEntityCallback(product, FakeStoreDto.class);
        HttpMessageConverterExtractor<FakeStoreDto> responseExtractor = new HttpMessageConverterExtractor(FakeStoreDto.class, restTemplate.getMessageConverters());
        FakeStoreDto response = restTemplate.execute("https://fakestoreapi.com/products/" + id,
                HttpMethod.PUT, requestCallback, responseExtractor);
        return convertFakeStoreDtoToProduct(response);
    }

  //  @Override
//    public Product updateProduct(long id, Product product) {
////        RequestCallback requestCallback = restTemplate.httpEntityCallback(product,FakeStoreDto.class);
////        HttpMessageConverterExtractor<FakeStoreDto> responseExtractor =
////                new HttpMessageConverterExtractor<>(FakeStoreDto.class, restTemplate.getMessageConverters());
////        FakeStoreDto response = restTemplate.execute("https://fakestoreapi.com/products/"+ id, HttpMethod.PATCH, requestCallback, responseExtractor);
////        return convertFakeStoreDtoToProduct(response);
//
//
//        ResponseEntity<FakeStoreDto> fakeStoreProductDtoResponseEntity = requestForEntity(HttpMethod.PATCH,"https://fakestoreapi.com/products/{id}",product, FakeStoreDto.class,id);
//        FakeStoreDto response = fakeStoreProductDtoResponseEntity.getBody();
//        return convertFakeStoreDtoToProduct(response);
//    }

//    private <T> ResponseEntity<T> requestForEntity(HttpMethod httpMethod, String url, @Nullable Object request, Class<T> responseType, Object... uriVariables) {
//        //RestTemplate restTemplate = restTemplateBuilder.build();
//        RestTemplate restTemplate = restTemplateBuilder.requestFactory(
//                HttpComponentsClientHttpRequestFactory.class
//        ).build();
//        RequestCallback requestCallback = restTemplate.httpEntityCallback(request, responseType);
//        ResponseExtractor<ResponseEntity<T>> responseExtractor = restTemplate.responseEntityExtractor(responseType);
//        return restTemplate.execute(url, httpMethod, requestCallback, responseExtractor, uriVariables);
//    }

 //   @Override
//    public Product ReplaceProduct(long id, Product product) {
//        ResponseEntity<FakeStoreDto> fakeStoreProductDtoResponseEntity = requestForEntity(HttpMethod.PUT,"https://fakestoreapi.com/products/{id}",product, FakeStoreDto.class,id);
//        FakeStoreDto response = fakeStoreProductDtoResponseEntity.getBody();
//        return convertFakeStoreDtoToProduct(response);
//    }


    public Product deleteProduct(Long id) {
        RequestCallback requestCallback = restTemplate.httpEntityCallback(null);
        HttpMessageConverterExtractor<FakeStoreDto> responseExtractor = new HttpMessageConverterExtractor(FakeStoreDto.class,
                restTemplate.getMessageConverters());
        FakeStoreDto response = restTemplate.execute("https://fakestoreapi.com/products/" + id,
                HttpMethod.DELETE, requestCallback, responseExtractor);
        return convertFakeStoreDtoToProduct(response);
    }

    private Product convertFakeStoreDtoToProduct(FakeStoreDto fakeStoreDto){
        Product product=new Product();
        product.setId(fakeStoreDto.getId());
        product.setTitle(fakeStoreDto.getTitle());
        product.setPrice(fakeStoreDto.getPrice());

        Category category=new Category();
        category.setDescription(fakeStoreDto.getDescription());
        product.setCategory(category);

        return product;
    }
}
