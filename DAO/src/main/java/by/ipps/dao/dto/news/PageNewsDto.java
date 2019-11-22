package by.ipps.dao.dto.news;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PageNewsDto {

    List<NewsDto> content;
    long totalElements;
    private int number;
    private int size;
    private int totalPages;
    private int numberOfElements;
}
