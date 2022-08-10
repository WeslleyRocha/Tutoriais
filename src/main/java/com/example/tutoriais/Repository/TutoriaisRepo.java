package com.example.tutoriais.Repository;

import com.example.tutoriais.Model.Tutoriais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutoriaisRepo extends JpaRepository<Tutoriais,Long> {
}