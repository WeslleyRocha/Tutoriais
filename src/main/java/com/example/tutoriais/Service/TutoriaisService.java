package com.example.tutoriais.Service;

import com.example.tutoriais.Model.Tutoriais;
import com.example.tutoriais.Repository.TutoriaisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutoriaisService implements ITutoriaisService {

	@Autowired
	public TutoriaisRepo repo;

	@Override
	public Tutoriais save(Tutoriais tutoriais) {
		return repo.save(tutoriais);
	}

	@Override
	public List<Tutoriais> listAll() {

		List<Tutoriais> list = new ArrayList<>();

		Iterable<Tutoriais> resposta = repo.findAll();

		resposta.forEach(list::add);
		return list;
	}

	@Override
	public Tutoriais findById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public Tutoriais updateById(Tutoriais tutoriais) {
		return repo.save(tutoriais);
	}

	@Override
	public String deleteById(Long id) {
		repo.deleteById(id);
		return "Id:"+ id + ", Apagado com sucesso!";
	}

	@Override
	public Tutoriais deleteAll(Tutoriais tutoriais) {
		repo.deleteAll();
		return null;
	}
}