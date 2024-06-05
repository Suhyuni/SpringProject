package inhatc.cse.spring.controller.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
@NoArgsConstructor  //기본생성자
@AllArgsConstructor //전체 다 채워진 생성자
@Builder
public class BookDto {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publication_year;
    private String imageUrl;
}
