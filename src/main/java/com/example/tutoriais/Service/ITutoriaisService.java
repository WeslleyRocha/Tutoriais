package com.example.tutoriais.Service;

import com.example.tutoriais.Model.Tutoriais;

import java.util.List;

public interface ITutoriaisService {

	Tutoriais save (Tutoriais tutoriais);

	List<Tutoriais> listAll ();

	Tutoriais findById (Long id);

	Tutoriais updateById (Tutoriais tutoriais);

	String deleteById (Long Id);

	Tutoriais deleteAll (Tutoriais tutoriais);
}