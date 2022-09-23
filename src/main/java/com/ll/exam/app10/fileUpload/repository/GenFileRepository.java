package com.ll.exam.app10.fileUpload.repository;

import com.ll.exam.app10.fileUpload.entity.GenFile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenFileRepository extends JpaRepository<GenFile, Long> {
    List<GenFile> findByRelTypeCodeAndRelIdOrderByTypeCodeAscType2CodeAscFileNoAsc(String relTypeCode, Long relId);
}
