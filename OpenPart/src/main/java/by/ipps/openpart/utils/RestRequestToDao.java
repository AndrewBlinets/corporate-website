package by.ipps.openpart.utils;

import by.ipps.openpart.entity.BaseEntity;
import org.springframework.stereotype.Component;

@Component
public interface RestRequestToDao<T extends BaseEntity> {
    public T restPostRequest(T t, String path);
    public T restGetRequest(String path);
}