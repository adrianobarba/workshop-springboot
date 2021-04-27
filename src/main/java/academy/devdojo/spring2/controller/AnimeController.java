package academy.devdojo.spring2.controller;

import academy.devdojo.spring2.domain.Anime;
import academy.devdojo.spring2.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    @Autowired
    private DateUtil dateUtil;
    //localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
       return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
