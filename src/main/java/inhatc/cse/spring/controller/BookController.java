package inhatc.cse.spring.controller;

import inhatc.cse.spring.controller.dto.BookDto;
import inhatc.cse.spring.service.BookService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @GetMapping("/save")
    public String save() {
        log.info("===================도서 등록 처리중");
        return "book/save";
    }

    @PostMapping("/save")
    public String bookInsert(BookDto bookDto) {
        log.info("================" + bookDto);
        int result = bookService.save(bookDto);
        if (result > 0) {
            return "redirect:/book/list";
        } else {
            return "book/save";
        }
    }

    @GetMapping("/list")
    public String bookList(Model model) {
        List<BookDto> bookList = bookService.findAll();
        log.info("========>" + bookList);
        model.addAttribute("bookList", bookList);
        return "book/list";
    }

//    @GetMapping("/{id}")
//    public String getBookById(@PathVariable int id, Model model) {
//        BookDto book = bookService.findById(id);
//        if (book != null) {
//            model.addAttribute("book", book);
//            return "book/detail";
//        } else {
//            return "redirect:/book/list";
//        }
//    }
}
