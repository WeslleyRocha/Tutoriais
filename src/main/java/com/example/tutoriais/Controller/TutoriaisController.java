package com.example.tutoriais.Controller;

import com.example.tutoriais.Model.Tutoriais;
import com.example.tutoriais.Service.TutoriaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tutoriais")
public class TutoriaisController {


	@Autowired
	private TutoriaisService service;


	//POST - /api/tutorials - Crie um novo Tutorial.
	@PostMapping
	public ResponseEntity<Tutoriais> save(@RequestBody Tutoriais tutoriais){
		return ResponseEntity.ok(service.save(tutoriais));
	}

	//GET - /api/tutorials - Retornar todos os tutoriais.
	@GetMapping
	public ResponseEntity<List<Tutoriais>> listAll(){
		return ResponseEntity.ok(service.listAll());
	}


	//GET - /api/tutorials/id - Retornar um tutorial por id.
	@GetMapping("/{id}")
	public ResponseEntity<Tutoriais> findById(@PathVariable Long id){
		return ResponseEntity.ok(service.findById(id));
	}

	//PUT - /api/tutorials/id - Atualizar um tutorial por id.
	@PutMapping("/{id}")
	public ResponseEntity<Tutoriais> updateById(@RequestBody Tutoriais tutoriais){
		return ResponseEntity.ok(service.updateById(tutoriais));
	}

	//	DELETE - /api/tutorials/id - Excluir um tutorial por id.
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id){
		return ResponseEntity.ok(service.deleteById(id));
	}


	//	GET - /api/tutorials/published - Buscar todos os tutoriais publicados.
	//	DELETE - /api/tutorials - Excluir todos os tutoriais.
	//	GET - /api/tutorials?title=Spring - Buscar todos os tutoriais que tenham a palavra “Spring” no título.

}
