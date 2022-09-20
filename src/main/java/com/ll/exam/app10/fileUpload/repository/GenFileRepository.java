package com.ll.exam.app10.fileUpload.repository;

import com.ll.exam.app10.fileUpload.entity.GenFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenFileRepository extends JpaRepository<GenFile, Long> {
}
