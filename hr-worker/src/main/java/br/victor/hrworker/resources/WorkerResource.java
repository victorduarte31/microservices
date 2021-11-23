package br.victor.hrworker.resources;

import br.victor.hrworker.entities.Worker;
import br.victor.hrworker.services.WorkerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
@Slf4j
public class WorkerResource {

    private final WorkerService service;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> all = service.getAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping("{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker worker = service.getById(id);
        return ResponseEntity.ok(worker);
    }

}
