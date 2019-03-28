package store.zabbix.toolscrudjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import store.zabbix.common.jpa.entity.Fiction;
import store.zabbix.toolscrudjpa.repository.FictionRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FictionController {

    private final FictionRepository fictionRepository;

    @Autowired
    public FictionController(FictionRepository fictionRepository) {
        this.fictionRepository = fictionRepository;
    }

    @GetMapping("fiction")
    public List<Fiction> getFiction(){
        List<Integer> list = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
        List<Fiction> list1 =  fictionRepository.findAllById(list);

        return list1;

    }

}
